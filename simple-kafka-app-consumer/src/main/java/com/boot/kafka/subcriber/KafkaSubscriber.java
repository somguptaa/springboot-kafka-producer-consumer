package com.boot.kafka.subcriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaSubscriber {
	
	@KafkaListener(topics = "${app.tpc.name}",groupId = "grp3")
	public void readMessage(String msg) {
		System.out.println(msg);
	}

}
