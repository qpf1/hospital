package com.ssh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.pojo.LimitPojo;
import com.ssh.service.ShowMenuListService;


@Controller("showMenuListAction")
@Scope("prototype")
public class ShowMenuListAction implements ModelDriven<LimitPojo>{
	
	@Autowired()@Qualifier("showMenuListService")
	private ShowMenuListService sml;
	
	
	private LimitPojo lp = new LimitPojo();
	public LimitPojo getModel() {
		return lp;
	}
	public String showMenuList() {
		LimitPojo l = sml.showList(lp);
		lp.setRows(l.getRows());
		lp.setTotal(l.getTotal());
		return "list";
	}


	
}
