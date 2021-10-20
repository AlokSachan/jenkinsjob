package com.alok.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
class JenkinsServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldShowSimpleAssertion() {
		log.info("***********************");
		log.info("inside the testCase");
		log.info("***********************");
		Assertions.assertEquals(1, 1);
	}

	@Test
	void greetingMessage() {
		String message="Greeting Message";
		log.info("inside the greetingMessage");
		Assertions.assertEquals(message, "Greeting Message");
	}

}
