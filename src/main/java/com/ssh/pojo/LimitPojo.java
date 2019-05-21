package com.ssh.pojo;

import java.util.List;

public class LimitPojo {

	private Integer pageNumber;
	private Integer pageSize;
	private String name;
	private List<Resources> rows;
	private Integer total;
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Resources> getRows() {
		return rows;
	}
	public void setRows(List<Resources> rows) {
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public LimitPojo(Integer pageNumber, Integer pageSize, String name, List<Resources> rows, Integer total) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.name = name;
		this.rows = rows;
		this.total = total;
	}
	public LimitPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
