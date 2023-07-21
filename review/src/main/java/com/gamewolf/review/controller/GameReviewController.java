package com.gamewolf.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gamewolf.base.dto.MessageDTO;
import com.gamewolf.review.config.ServicesConfig;
import com.gamewolf.review.feignclient.DemoFeignClient;
import com.gamewolf.review.model.VgReviewWithBLOBs;
import com.gamewolf.review.service.IGameReviewService;

@CrossOrigin
@RestController
@RequestMapping("review")
public class GameReviewController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
    private LoadBalancerClient loadBalancerClient;
	
	@Autowired
	private ServicesConfig config;
	
	@Autowired 
	private DemoFeignClient client;
	
	@Autowired
	private IGameReviewService reviewService;
	
	
	@RequestMapping(value = "/example", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO Example() {
		MessageDTO m=new MessageDTO();
		m.setCode("100");
		m.setMessage("hello review");
        ServiceInstance serviceInstance = loadBalancerClient.choose("gameinfo");
        String path = String.format("http://%s:%s/gameinfo/example",serviceInstance.getHost(),serviceInstance.getPort());
        System.out.println("request path:" +path);
        String msg= restTemplate.getForObject(path,String.class);
        m.setData("msg", msg);
        m.setData("nacos",config.getName());
        String feignResult=client.getExample();
        m.setData("feign", feignResult);
		return m;
	}
	
	@RequestMapping(value = "/addReviewExample", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO addExample() {
		MessageDTO m=new MessageDTO();
		m.setCode("100");
		m.setMessage("hello review");
		VgReviewWithBLOBs reviewBlob=new VgReviewWithBLOBs();
		reviewBlob.setGameId(-1l);
		reviewBlob.setIsAnonimous(true);
		reviewBlob.setOverallRate(4);
		reviewBlob.setReviewCnt("不错的游戏");
		reviewService.AddGameReview(reviewBlob);
        return m;
	}
}
