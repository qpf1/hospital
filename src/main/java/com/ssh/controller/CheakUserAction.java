package com.ssh.controller;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ssh.pojo.User;

import net.sf.json.JSONObject;

@Controller("cheakUserAction")
@Scope("prototype")
public class CheakUserAction {
	
	private JSONObject json;
	

	public String cheak() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			json = JSONObject.fromObject(user);
			return "cheak";			
		}else {
			return "error";
		}
	}


	public JSONObject getJson() {
		return json;
	}


	public void setJson(JSONObject json) {
		this.json = json;
	}
	
	
}
