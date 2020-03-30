package com.newer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.newer.dao.ScoreDao;
import com.newer.domian.Score;

public interface ScoreService {

	
       public String addScore(Score score);
}
