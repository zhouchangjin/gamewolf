package com.gamewolf.gameinfo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamewolf.base.dto.MessageDTO;

import ch.qos.logback.classic.Logger;

@CrossOrigin
@RestController
@RequestMapping("menu")
public class MenuController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(GameInfoController.class);
	
	@RequestMapping(value = "/defaultlist", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO getDefaultMenu() {
		MessageDTO m=new MessageDTO();
		
		logger.info("menu controller");
		return m;
	}
}
