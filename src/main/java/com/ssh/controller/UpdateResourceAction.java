package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.pojo.Resources;
import com.ssh.service.UpdateResourceService;

@Controller("updateResourceAction")
@Scope("prototype")
public class UpdateResourceAction implements ModelDriven<Resources>{

	@Autowired()@Qualifier("updateResourceService")
	private UpdateResourceService urs;
	private Resources r = new Resources();
	public Resources getModel() {
		// TODO Auto-generated method stub
		return r;
	}
	public String updateRes() {
		urs.updateRes(r);
		return "update";
	}

	
}
