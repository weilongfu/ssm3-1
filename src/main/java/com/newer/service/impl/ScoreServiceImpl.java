package com.newer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.ScoreDao;
import com.newer.domian.Score;
import com.newer.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService{
	@Autowired
	private ScoreDao scoredao;

	@Override
	public String addScore(Score score) {
		// TODO Auto-generated method stub
		return scoredao.updateByExample(score, score.getStuid())>0?"添加成功":"添加失败";
	}

}
