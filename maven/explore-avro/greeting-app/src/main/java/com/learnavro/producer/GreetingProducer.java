package com.learnavro.producer;

import com.learnavro.Greeting;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class GreetingProducer {
    private static final Logger log = LoggerFactory.getLogger(GreetingProducer.class);
    private static final String GREETING_TOPIC = "greeting";

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");

        KafkaProducer<String, byte[]> producer = new KafkaProducer<>(properties);

        Greeting greeting = buildGreeting("Hello, Schema Registry");

        byte[] value = greeting.toByteBuffer().array();

        ProducerRecord<String, byte[]> producerRecord =
                new ProducerRecord<>(GREETING_TOPIC, value);

        var recordMetaData = producer.send(producerRecord).get();
        log.info("recordMetaData: {}", recordMetaData);
    }

    private static Greeting buildGreeting(String greeting) {
        return Greeting
                .newBuilder()
                .setGreeting(greeting)
                .build();
    }
}
