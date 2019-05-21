package com.ssh.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.EchoResourcessMessageDao;
import com.ssh.pojo.Resources;

@Repository("echoResourcessMessageDao")
@Transactional(readOnly=true)
public class EchoResourcessMessageDaoImpl implements EchoResourcessMessageDao {
	
	private SessionFactory sf;
	@Autowired()@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sf = sessionFactory;
    }

	public Resources echoResources(DetachedCriteria dc) {
		Criteria c = dc.getExecutableCriteria(sf.openSession());
		Resources res = (Resources) c.uniqueResult();
		return res;
	}

}
