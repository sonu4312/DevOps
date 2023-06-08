package com.example.demo.com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	public static final Logger Logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		Logger.info("ITs a Ci Pipeline Job");
		SpringApplication.run(DemoApplication.class, args);
	}

@Override
public void run(String... args)throws Exception{
	Logger.info("Second log");
}
}
