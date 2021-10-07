package com.home.apacheMQEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.apacheMQEx.pojo.Employee;
import com.home.apacheMQEx.service.JMSProducer;

@RestController(value = "/api")
public class MainController {

	
	@Autowired
    JMSProducer jmsProducer;

    @PostMapping(value="/api/employee")
    public Employee sendMessage(@RequestBody Employee employee){
        jmsProducer.sendMessage(employee);
        return employee;
    }

	
}
