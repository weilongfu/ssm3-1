package com.newer.domian;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_score")
public class Score {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer scoreid;
	   private Integer stuid;
	   private Integer subid;
	   private Integer score;
	public Score(Integer scoreid, Integer stuid, Integer subid, Integer score) {
		super();
		this.scoreid = scoreid;
		this.stuid = stuid;
		this.subid = subid;
		this.score = score;
	}
	   public Score() {
		// TODO Auto-generated constructor stub
	}
	public Integer getScoreid() {
		return scoreid;
	}
	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public Integer getSubid() {
		return subid;
	}
	public void setSubid(Integer subid) {
		this.subid = subid;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [scoreid=" + scoreid + ", stuid=" + stuid + ", subid=" + subid + ", score=" + score + "]";
	}
	   
}
