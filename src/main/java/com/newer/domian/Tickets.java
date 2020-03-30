package com.newer.domian;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "TB_Tickets")
public class Tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketid;
	
	private String ticketname;

	private Integer stadiumid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date begintime;
	
	private Integer totalcount;
	
	private Integer ordercount;

	private Integer price;
	
	private String descn;

	
	//格式化日期类型字符串
	 //入职时间返回日期类型查询转换字符串
    public String getBeginTimeString(){
		if(this.begintime!=null){
			SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
			String date=sim.format(this.begintime);
			return date;
		}
		return null;
	}
public Tickets() {
	// TODO Auto-generated constructor stub
}
public Tickets(Integer ticketid, String ticketname, Integer stadiumid, Date begintime, Integer totalcount,
		Integer ordercount, Integer price, String descn) {
	super();
	this.ticketid = ticketid;
	this.ticketname = ticketname;
	this.stadiumid = stadiumid;
	this.begintime = begintime;
	this.totalcount = totalcount;
	this.ordercount = ordercount;
	this.price = price;
	this.descn = descn;
}
public Integer getTicketid() {
	return ticketid;
}
public void setTicketid(Integer ticketid) {
	this.ticketid = ticketid;
}
public String getTicketname() {
	return ticketname;
}
public void setTicketname(String ticketname) {
	this.ticketname = ticketname;
}
public Integer getStadiumid() {
	return stadiumid;
}
public void setStadiumid(Integer stadiumid) {
	this.stadiumid = stadiumid;
}
public Date getBegintime() {
	return begintime;
}
public void setBegintime(Date begintime) {
	this.begintime = begintime;
}
public Integer getTotalcount() {
	return totalcount;
}
public void setTotalcount(Integer totalcount) {
	this.totalcount = totalcount;
}
public Integer getOrdercount() {
	return ordercount;
}
public void setOrdercount(Integer ordercount) {
	this.ordercount = ordercount;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public String getDescn() {
	return descn;
}
public void setDescn(String descn) {
	this.descn = descn;
}
@Override
public String toString() {
	return "Tickets [ticketid=" + ticketid + ", ticketname=" + ticketname + ", stadiumid=" + stadiumid + ", begintime="
			+ begintime + ", totalcount=" + totalcount + ", ordercount=" + ordercount + ", price=" + price + ", descn="
			+ descn + "]";
}

}
