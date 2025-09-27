package com.itsajs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ApiGatewayApplicationMain
{
	public static void main(String[] args) 
	{
		log.info("entered in ApiGatewayApplicationMain.java main()....");
		
		SpringApplication.run(ApiGatewayApplicationMain.class, args);
		
		log.info("************API GATEWAY APPLICATION STARTED************");
		
	}

}
