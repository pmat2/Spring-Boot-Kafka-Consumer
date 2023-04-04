package dev.devpro.SpringBootKafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringBootKafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
    }

}
