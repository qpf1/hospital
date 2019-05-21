package com.ssh.pojo;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2512399402567709433L;
	private Integer u_id;
	private String u_name;
	private String u_password;
	private String u_realname;
	private String u_email;
	private Integer u_r_id;
	private Integer u_status;
	private Integer u_use;
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_realname() {
		return u_realname;
	}
	public void setU_realname(String u_realname) {
		this.u_realname = u_realname;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public Integer getU_r_id() {
		return u_r_id;
	}
	public void setU_r_id(Integer u_r_id) {
		this.u_r_id = u_r_id;
	}
	public Integer getU_status() {
		return u_status;
	}
	public void setU_status(Integer u_status) {
		this.u_status = u_status;
	}
	public Integer getU_use() {
		return u_use;
	}
	public void setU_use(Integer u_use) {
		this.u_use = u_use;
	}
	public User(Integer u_id, String u_name, String u_password, String u_realname, String u_email, Integer u_r_id,
			Integer u_status, Integer u_use) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_realname = u_realname;
		this.u_email = u_email;
		this.u_r_id = u_r_id;
		this.u_status = u_status;
		this.u_use = u_use;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
