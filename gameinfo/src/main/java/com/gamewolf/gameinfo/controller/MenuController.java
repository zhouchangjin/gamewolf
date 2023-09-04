package com.gamewolf.gameinfo.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamewolf.base.dto.MessageDTO;
import com.gamewolf.base.model.VgMenu;
import com.gamewolf.base.service.IMenuService;

import ch.qos.logback.classic.Logger;

@CrossOrigin
@RestController
@RequestMapping("menu")
public class MenuController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(GameInfoController.class);
	
	@Autowired
	IMenuService menuService;
	
	@RequestMapping(value = "/defaultlist", method = RequestMethod.GET)
	@ResponseBody
	public MessageDTO getDefaultMenu() {
		MessageDTO m=new MessageDTO();
		List<VgMenu> menulist=menuService.listMenu();
		logger.info("menu controller");
		m.setData(menulist);
		return m;
	}
}
