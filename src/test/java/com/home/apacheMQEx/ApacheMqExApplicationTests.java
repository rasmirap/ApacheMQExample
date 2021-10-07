package com.home.apacheMQEx;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApacheMqExApplicationTests {
	Logger logger = LoggerFactory.getLogger(ApacheMqExApplicationTests.class);
	
	@LocalServerPort
	int port;
	
	@Test
	void contextLoads() {

	}

}
