package com.gamewolf.review.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="gameinfo",path="/gameinfo")
public interface DemoFeignClient {
	@RequestMapping("example")
	public String getExample();
	
	@RequestMapping("addGameInfoExample")
	public String addGameInfoExample();
}
