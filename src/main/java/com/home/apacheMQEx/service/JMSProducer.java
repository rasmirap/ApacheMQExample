package com.home.apacheMQEx.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.home.apacheMQEx.pojo.Employee;

@Component
public class JMSProducer {

	Logger log=LogManager.getLogger(JMSProducer.class);
	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${active-mq.topic}")
	private String topic;

	public void sendMessage(Employee message) {
		try {
			log.info("Attempting Send message to Topic: " + topic);
			jmsTemplate.convertAndSend(topic, message);
		} catch (Exception e) {
			log.error("Recieved Exception during send Message: ", e);
		}
	}
}
