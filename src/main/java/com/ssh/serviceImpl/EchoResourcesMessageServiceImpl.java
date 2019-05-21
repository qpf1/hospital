package com.ssh.serviceImpl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssh.dao.EchoResourcessMessageDao;
import com.ssh.pojo.Resources;
import com.ssh.service.EchoResourcesMessageService;

@Service("echoResourcessMessageService")
public class EchoResourcesMessageServiceImpl implements EchoResourcesMessageService {

	@Autowired()@Qualifier("echoResourcessMessageDao")
	private EchoResourcessMessageDao ermd;
	
	public Resources echoResourcess(Resources r) {
		DetachedCriteria dc = DetachedCriteria.forClass(Resources.class);
		dc.add(Restrictions.eq("res_id",r.getRes_id()));
		return ermd.echoResources(dc);
	}

}
