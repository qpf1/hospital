package com.ssh.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.InsertResourceDao;
import com.ssh.pojo.Resources;

@Repository("insertResourceDao")
@Transactional()
public class InsertResourceDaoImpl implements InsertResourceDao {

	private SessionFactory sf;
	@Autowired()@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sf = sessionFactory;
    }
	
	public void insertRes(Resources r) {
		Session session = sf.openSession();
		session.save(r);
	}

}
