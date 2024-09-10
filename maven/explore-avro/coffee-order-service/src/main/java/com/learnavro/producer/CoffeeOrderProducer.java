package com.learnavro.producer;

import com.learnavro.domain.generated.CoffeeOrder;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import static com.learnavro.util.CoffeeOrderUtil.buildNewCoffeeOrder;

public class CoffeeOrderProducer {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderProducer.class);
    private static final String COFFEE_ORDERS_TOPIC = "coffee-orders-sr";

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        properties.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

//        KafkaProducer<String, byte[]> producer = new KafkaProducer<>(properties);
        KafkaProducer<String, CoffeeOrder> producer = new KafkaProducer<>(properties);

        CoffeeOrder coffeeOrder = buildNewCoffeeOrder();

//        byte[] value = coffeeOrder.toByteBuffer().array();

        ProducerRecord<String, CoffeeOrder> producerRecord =
                new ProducerRecord<>(COFFEE_ORDERS_TOPIC, coffeeOrder);

        var recordMetaData = producer.send(producerRecord).get();
        log.info("recordMetaData: {}", recordMetaData);
    }
}
