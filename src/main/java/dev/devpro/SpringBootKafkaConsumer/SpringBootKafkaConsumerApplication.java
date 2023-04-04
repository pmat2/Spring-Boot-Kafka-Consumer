package dev.devpro.SpringBootKafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringBootKafkaConsumerApplication {

    private final Logger logger = LoggerFactory.getLogger(SpringBootKafkaConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
    }

    @KafkaListener(topics = "devpro-producer")
    public String listens(final String in) {
		logger.info("Received kafka event: {}", in);
        return in;
    }
}
