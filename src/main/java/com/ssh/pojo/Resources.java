package com.ssh.pojo;

import java.io.Serializable;

public class Resources implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6528856304193304147L;
	private Integer res_id;
	private String res_name;
	private String res_url;
	private Integer res_status;
	private Integer res_use;
	public Integer getRes_id() {
		return res_id;
	}
	public void setRes_id(Integer res_id) {
		this.res_id = res_id;
	}
	public String getRes_name() {
		return res_name;
	}
	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
	
	public String getRes_url() {
		return res_url;
	}
	public void setRes_url(String res_url) {
		this.res_url = res_url;
	}
	public Integer getRes_status() {
		return res_status;
	}
	public void setRes_status(Integer res_status) {
		this.res_status = res_status;
	}
	public Integer getRes_use() {
		return res_use;
	}
	public void setRes_use(Integer res_use) {
		this.res_use = res_use;
	}
	public Resources() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resources(Integer res_id, String res_name, String res_url, Integer res_status, Integer res_use) {
		super();
		this.res_id = res_id;
		this.res_name = res_name;
		this.res_url = res_url;
		this.res_status = res_status;
		this.res_use = res_use;
	}
	
}
