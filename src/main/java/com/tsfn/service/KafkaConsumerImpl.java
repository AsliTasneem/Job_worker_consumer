package com.tsfn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerImpl {
	
	@KafkaListener(topics = "SalesforceTopic" , groupId = "groupId") // from which topic i want to read the masseges
	public void listen(String message)
	{
		System.out.println("message recieved :"+ message+" from SalesforceTopic !!");
	}

}