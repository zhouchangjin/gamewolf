package com.gamewolf.gameinfo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamewolf.base.dto.MessageDTO;
import com.gamewolf.gameinfo.model.VgInfo;
import com.gamewolf.gameinfo.service.IGameInfoService;

import ch.qos.logback.classic.Logger;

@CrossOrigin
@RestController
@RequestMapping("gameinfo")
public class GameInfoController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(GameInfoController.class);
	
	@Autowired
	IGameInfoService service;
	
	
	@RequestMapping(value = "/example", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO ExampleGameInfo() {
		MessageDTO m=new MessageDTO();
		List<VgInfo> list=service.getGameList();
		m.setCode("100");
		m.setMessage("hellow world");
		m.setData("list", list);
		
		logger.info("Test logger");
		return m;
	}
	
	@RequestMapping(value = "/asyn_example", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO AsynExampleGameInfo() {
		MessageDTO m=new MessageDTO();
		m.setCode("100");
		m.setMessage("hellow world multithread tasking");
		logger.info("启动多线程 logger");
		//多线程示例
		for(int i=0;i<10;i++) {
			service.asynTask(i);
		}
		List<Future<String>> futurelist=new ArrayList<Future<String>>();
		for(int i=0;i<3;i++) {
			Future<String> future=service.asynFutureTask(i);
			futurelist.add(future);
		}
		
		//下面的代码会导致接口阻塞
		/**
		for(Future<String> f:futurelist) {
			try {
				logger.info(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		**/
		return m;
	}
	
	@RequestMapping(value = "/addGameInfoExample", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO ExampleAddGameInfo() {
		MessageDTO m=new MessageDTO();
		m.setCode("100");
		VgInfo info=new VgInfo();
		info.setGametitleEn("Sword and Fairy 7");
		info.setDevComName("Domo");
		info.setReleaseDate(new Date());
		service.AddGameInfo(info);
		m.setMessage("hellow world");
		return m;
	}

}
