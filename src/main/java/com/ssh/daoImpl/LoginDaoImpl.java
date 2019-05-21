package com.ssh.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.LoginDao;
import com.ssh.pojo.User;

@Repository("loginDao")
@Transactional(readOnly=true)
public class LoginDaoImpl implements LoginDao {

	private SessionFactory sf;
	@Autowired()@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sf = sessionFactory;
    }
	
	public User login(DetachedCriteria dc) {
		Session session = sf.openSession();
		Criteria c = dc.getExecutableCriteria(session);
		User user = (User) c.uniqueResult();
		return user;
	}

}
