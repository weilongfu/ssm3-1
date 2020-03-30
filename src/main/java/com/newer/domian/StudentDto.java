package com.newer.domian;


public class StudentDto {
    private Integer stuid;
    private String stuname;
    private Integer subid;
    private Integer score;
    private String subname;
    public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public StudentDto(Integer stuid, String stuname, Integer subid, Integer score, String subname) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.subid = subid;
		this.score = score;
		this.subname = subname;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
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
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "StudentDto [stuid=" + stuid + ", stuname=" + stuname + ", subid=" + subid + ", score=" + score
				+ ", subname=" + subname + "]";
	}
	
}
