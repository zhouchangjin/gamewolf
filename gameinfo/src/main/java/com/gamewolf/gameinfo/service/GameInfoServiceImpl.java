package com.gamewolf.gameinfo.service;

import java.util.List;
import java.util.concurrent.Future;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.gamewolf.gameinfo.mapper.VgInfoMapper;
import com.gamewolf.gameinfo.model.VgInfo;

import ch.qos.logback.classic.Logger;

@Service
public class GameInfoServiceImpl implements IGameInfoService {
	
	Logger logger = (Logger) LoggerFactory.getLogger(GameInfoServiceImpl.class);
	
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
	
	@Async("gameinfoThreadPoolTaskExecutor")
	@Override
	public void asynTask(int taskid) {
		logger.info("task"+taskid+" is executed");
		//System.out.println("this is a asyn task");
	}

	@Async("gameinfoThreadPoolTaskExecutor")
	@Override
	public Future<String> asynFutureTask(int taskid) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			logger.info("future task"+taskid+" processing");
			return new AsyncResult<String>("Computing done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
