package com.boot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaSimpleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSimpleAppApplication.class, args);
	}

}
