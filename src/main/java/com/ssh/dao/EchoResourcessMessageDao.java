package com.ssh.dao;

import org.hibernate.criterion.DetachedCriteria;

import com.ssh.pojo.Resources;

public interface EchoResourcessMessageDao {

	Resources echoResources(DetachedCriteria dc);

}
