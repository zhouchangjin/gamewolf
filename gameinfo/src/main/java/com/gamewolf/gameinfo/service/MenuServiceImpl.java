package com.gamewolf.gameinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamewolf.gameinfo.mapper.VgMenuMapper;
import com.gamewolf.gameinfo.model.VgMenu;
@Service
public class MenuServiceImpl implements IMenuService {
	
	@Autowired
	VgMenuMapper vgMenuMapper;

	@Override
	public List<VgMenu> listMenu() {
		return vgMenuMapper.listAllMenu();
		
	}
	
	

}
