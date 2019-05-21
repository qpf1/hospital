package com.ssh.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.ssh.pojo.LimitPojo;
import com.ssh.pojo.Resources;

public interface ShowMenuListDao {

	List<Resources> showList(DetachedCriteria dc,LimitPojo lp);
	int count(LimitPojo lp);

}
