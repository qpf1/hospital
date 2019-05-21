package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.pojo.Resources;
import com.ssh.service.EchoResourcesMessageService;

@Controller("echoResourcessMessageAction")
@Scope("prototype")
public class EchoResourcesMessageAction implements ModelDriven<Resources>{

	@Autowired()@Qualifier("echoResourcessMessageService")
	private EchoResourcesMessageService erms;
	
	private Resources r = new Resources();
	public Resources getModel() {
		return r;
	}
	public String echoResourcess() {
		Resources re = erms.echoResourcess(r);
		r.setRes_id(re.getRes_id());
		r.setRes_name(re.getRes_name());
		r.setRes_status(re.getRes_status());
		r.setRes_url(re.getRes_url());
		r.setRes_use(re.getRes_use());
		return "echo";
	}

}
