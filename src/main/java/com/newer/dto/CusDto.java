package com.newer.dto;

public class CusDto {
	private String key;

	public CusDto() {
		// TODO Auto-generated constructor stub
	}

	public CusDto(String key) {
		super();
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "CusDto [key=" + key + "]";
	}

}
