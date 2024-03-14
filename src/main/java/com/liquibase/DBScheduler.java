package com.liquibase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DBScheduler {

	@Value("${message}")
	private String message;

	@Scheduled(cron = "0/1 * * * * *")
	public void printMessage() {
		System.out.println("Hello from " + message);
	}

}
