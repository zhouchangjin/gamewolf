package com.gamewolf.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamewolf.review.mapper.VgReviewMapper;
import com.gamewolf.review.model.VgReviewWithBLOBs;

@Service
public class GameReviewServiceImpl implements IGameReviewService {
	
	@Autowired
	VgReviewMapper vgReviewMapper;

	@Override
	public void AddGameReview(VgReviewWithBLOBs review) {
		vgReviewMapper.insert(review);
	}

}
