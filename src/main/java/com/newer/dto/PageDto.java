package com.newer.dto;

public class PageDto extends CusDto{
	private int page = 1; //��ǰҳ��
	private int pageSize = 3; //ÿҳ��ʾ������

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public PageDto() {
		// TODO Auto-generated constructor stub
	}

}
