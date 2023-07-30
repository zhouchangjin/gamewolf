package com.gamewolf.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamewolf.review.feignclient.DemoFeignClient;
import com.gamewolf.review.mapper.VgReviewMapper;
import com.gamewolf.review.model.VgReviewWithBLOBs;

import io.seata.spring.annotation.GlobalTransactional;

@Service
public class GameReviewServiceImpl implements IGameReviewService {
	
	@Autowired
	VgReviewMapper vgReviewMapper;
	
	@Autowired
	DemoFeignClient feignClient;

	@Override
	public void AddGameReview(VgReviewWithBLOBs review) {
		vgReviewMapper.insert(review);
	}

	@GlobalTransactional
	@Override
	public void AddGameInfoAndReview(VgReviewWithBLOBs review) {
		
		vgReviewMapper.insert(review);
		feignClient.addGameInfoExample();
		System.out.println("Roback"+1/0);
	}

}
