package com.ssh.serviceImpl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssh.dao.LoginDao;
import com.ssh.pojo.User;
import com.ssh.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired()@Qualifier("loginDao")
	private LoginDao ld;

	public User login(User user) {
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("u_name", user.getU_name()));
		dc.add(Restrictions.eq("u_password", user.getU_password()));
		return ld.login(dc);
	}

}
