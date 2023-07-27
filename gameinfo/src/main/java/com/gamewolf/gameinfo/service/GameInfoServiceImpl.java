package com.gamewolf.gameinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamewolf.gameinfo.mapper.VgInfoMapper;
import com.gamewolf.gameinfo.model.VgInfo;

@Service
public class GameInfoServiceImpl implements IGameInfoService {
	
	@Autowired
	VgInfoMapper vgInfoMapper;

	@Override
	public List<VgInfo> getGameList() {
		return vgInfoMapper.listInfo();
	}
	
	@Override
	public int AddGameInfo(VgInfo info){
		int id=vgInfoMapper.insert(info);
		return id;
	}

}
