package com.newer.domian;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TB_Stadia")
public class Stadia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stadiumid;
	private String name;
	private String address;
	private String descn;

	public Stadia() {
		// TODO Auto-generated constructor stub
	}

	public Stadia(Integer stadiumid, String name, String address, String descn) {
		super();
		this.stadiumid = stadiumid;
		this.name = name;
		this.address = address;
		this.descn = descn;
	}

	public Integer getStadiumid() {
		return stadiumid;
	}

	public void setStadiumid(Integer stadiumid) {
		this.stadiumid = stadiumid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescn() {
		return descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	@Override
	public String toString() {
		return "Stadia [stadiumid=" + stadiumid + ", name=" + name + ", address=" + address + ", descn=" + descn + "]";
	}

}
