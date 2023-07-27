package com.gamewolf.gameinfo.service;

import java.util.List;

import com.gamewolf.gameinfo.model.VgInfo;

public interface IGameInfoService {
	
	List<VgInfo> getGameList();

	int AddGameInfo(VgInfo info);

}
