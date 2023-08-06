package com.gamewolf.gameinfo.service;

import java.util.List;
import java.util.concurrent.Future;

import com.gamewolf.gameinfo.model.VgInfo;

public interface IGameInfoService {
	
	List<VgInfo> getGameList();

	int AddGameInfo(VgInfo info);
	
	void asynTask(int taskid);
	
	Future<String> asynFutureTask(int taskid);

}
