package com.newer.domian;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="t_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stu_id")
	private Integer stuid;
	
	@Column(name="stu_name")
	private String stuname;
	
	@Column(name="stu_sex")
	private String stusex;
	
	@Column(name="stu_age")
	private Integer stuage;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date intime;
    
    @Column(name="stu_photo")
    private String photo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer stuid, String stuname, String stusex, Integer stuage, Date intime, String photo) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
		this.intime = intime;
		this.photo = photo;
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

	public String getStusex() {
		return stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}

	public Integer getStuage() {
		return stuage;
	}

	public void setStuage(Integer stuage) {
		this.stuage = stuage;
	}

	public Date getIntime() {
		return intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
 
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stusex=" + stusex + ", stuage=" + stuage
				+ ", intime=" + intime + ", photo=" + photo + "]";
	}

	//入学时间返回日期类型查询转换字符串
    public String getIntimeString(){
		if(this.intime!=null){
			SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
			String date=sim.format(this.intime);
			return date;
		}
		return null;
	}
}
