package com.gamewolf.review.service;

import com.gamewolf.review.model.VgReviewWithBLOBs;

public interface IGameReviewService {
	
	void AddGameReview(VgReviewWithBLOBs review);
	
	void AddGameInfoAndReview(VgReviewWithBLOBs review);

}
