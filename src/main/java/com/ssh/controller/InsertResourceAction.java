package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.pojo.Resources;
import com.ssh.service.InsertResourceService;

@Controller("insertResourceAction")
@Scope("prototype")
public class InsertResourceAction implements ModelDriven<Resources>{

	@Autowired()@Qualifier("insertResourceService")
	private InsertResourceService irs;
	
	private Resources r =new Resources();
	public Resources getModel() {
		
		return r;
	}
	public String insertRes() {
		irs.insertRes(r);
		return "insert";
	}

	
}
