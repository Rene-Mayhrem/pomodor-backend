package com.pomodoro.pomodoro_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PomodoroBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomodoroBackendApplication.class, args);
	}

}
