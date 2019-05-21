package com.ssh.controller;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("outLoginAction")
@Scope("prototype")
public class OutLoginAction {

	public String outLogin() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("user",null);
		return "outlogin";
	}
}
