package com.ssh.dao;

import org.hibernate.criterion.DetachedCriteria;

import com.ssh.pojo.User;

public interface LoginDao {

	User login(DetachedCriteria dc);

}
