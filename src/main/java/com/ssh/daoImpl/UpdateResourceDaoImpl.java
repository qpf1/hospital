package com.ssh.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.UpdateResourceDao;
import com.ssh.pojo.Resources;

@Repository("updateResourceDao")
@Transactional
public class UpdateResourceDaoImpl implements UpdateResourceDao {

	@Autowired()@Qualifier("sessionFactory")
	private SessionFactory sf;
	
	public void updateRes(Resources r) {
		Session session = sf.getCurrentSession();
		Resources res = session.get(Resources.class,r.getRes_id());
		res.setRes_name(r.getRes_name());
		res.setRes_status(r.getRes_status());
		res.setRes_url(r.getRes_url());
		session.update(res);
	}

}
