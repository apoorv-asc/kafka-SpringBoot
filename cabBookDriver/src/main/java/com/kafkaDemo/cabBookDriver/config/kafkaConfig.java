package com.kafkaDemo.cabBookDriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafkaDemo.cabBookDriver.constant.AppConstant;

@Configuration
public class kafkaConfig {

	@Bean
	public NewTopic newTopic() {
		return TopicBuilder
				.name(AppConstant.CAB_LOCATION)
				.build();
	}
	
}
