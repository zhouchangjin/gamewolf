package com.gamewolf.gameinfo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.gamewolf.gameinfo.mapper")
public class GameInfoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameInfoServicesApplication.class, args);

	}

}
