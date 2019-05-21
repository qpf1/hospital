package com.ssh.controller;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.pojo.User;
import com.ssh.service.LoginService;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction implements ModelDriven<User>{

	private User user = new User();
	
	@Autowired()@Qualifier("loginService")
	private LoginService ls;
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String login() {
		User u = ls.login(user);
		if(u!=null) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("user",u);
			return "success";	
		}else {
			return "error";
		}
	}
	

}
