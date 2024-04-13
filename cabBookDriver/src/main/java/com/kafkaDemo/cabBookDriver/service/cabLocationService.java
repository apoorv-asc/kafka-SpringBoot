package com.kafkaDemo.cabBookDriver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaDemo.cabBookDriver.constant.AppConstant;

@Service
public class cabLocationService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		System.out.println("Sending to consumer");
		kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
		return true;
	}	
}