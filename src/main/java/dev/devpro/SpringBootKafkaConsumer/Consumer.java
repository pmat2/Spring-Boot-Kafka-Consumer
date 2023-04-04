package dev.devpro.SpringBootKafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "devpro-producer")
    public String listens(final String in) {
        logger.info("Received kafka event: {}", in);
        return in;
    }
}
