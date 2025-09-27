package com.itsajs.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class RedisConfig
{
	@Bean
	public KeyResolver ipKeyResolver() 
	{
	    log.info("entered in RedisConfig.java ipKeyResolver()...");

	    return serverWebExchange -> {
	        String ip = serverWebExchange.getRequest()
	                            .getRemoteAddress()
	                            .getAddress()
	                            .getHostAddress();
	        
	        log.info("ip from client request (browser/postman) : "+ip);
	      return Mono.just(ip);
	    };
	}

}//class
