package com.ssh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssh.dao.UpdateResourceDao;
import com.ssh.pojo.Resources;
import com.ssh.service.UpdateResourceService;

@Service("updateResourceService")
public class UpdateResourceServiceImpl implements UpdateResourceService {
	
	@Autowired()@Qualifier("updateResourceDao")
	private UpdateResourceDao urd;

	public void updateRes(Resources r) {
		urd.updateRes(r);
	}

}
