package com.ssh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssh.dao.InsertResourceDao;
import com.ssh.pojo.Resources;
import com.ssh.service.InsertResourceService;

@Service("insertResourceService")
public class InsertResourceServiceImpl implements InsertResourceService {

	@Autowired()@Qualifier("insertResourceDao")
	private InsertResourceDao ird;
	
	public void insertRes(Resources r) {
		r.setRes_use(1);
		ird.insertRes(r);
	}

}
