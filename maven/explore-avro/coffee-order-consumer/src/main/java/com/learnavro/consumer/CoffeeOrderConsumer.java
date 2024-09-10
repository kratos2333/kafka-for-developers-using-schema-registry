package com.learnavro.consumer;

import com.learnavro.domain.generated.CoffeeOrder;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class CoffeeOrderConsumer {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderConsumer.class);
    private static final String COFFEE_ORDERS_TOPIC = "coffee-orders-sr";

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        properties.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"coffee.consumer");

        KafkaConsumer<String, CoffeeOrder> consumer = new KafkaConsumer<>(properties);

        consumer.subscribe(List.of(COFFEE_ORDERS_TOPIC));

        while(true) {
            ConsumerRecords<String, CoffeeOrder> records = consumer.poll(Duration.ofMillis(100));
            for(ConsumerRecord<String, CoffeeOrder> coffeeOrder : records) {
                log.info("consumed message, key:{}, value:{}",  coffeeOrder.key(), coffeeOrder.value().toString());
            }
        }
    }

    private static CoffeeOrder decideCoffeeOrder(byte[] value) throws IOException {
        return CoffeeOrder.fromByteBuffer(ByteBuffer.wrap(value));
    }
}
