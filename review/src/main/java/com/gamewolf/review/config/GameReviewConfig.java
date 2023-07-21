package com.gamewolf.review.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GameReviewConfig {
	
    @Bean
    //@LoadBalanced 属于老版本riben
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }

}
