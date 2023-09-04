package com.gamewolf.gameinfo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAsync  //异步 支持线程池 不需要在这里
@EnableFeignClients //非url方式调用微服务
@EnableDiscoveryClient //注册服务
@MapperScan({"com.gamewolf.gameinfo.mapper","com.gamewolf.base.mapper"}) //mybatis
@ComponentScan({"com.gamewolf.base.*","com.gamewolf.gameinfo.*"})
public class GameInfoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameInfoServicesApplication.class, args);

	}

}
