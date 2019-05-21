package com.ssh.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ShowMenuListDao;
import com.ssh.pojo.LimitPojo;
import com.ssh.pojo.Resources;



@Repository("showMenuListDao")
@Transactional(readOnly=true)
public class ShowMenuListDaoImpl implements ShowMenuListDao {

	private SessionFactory sf;
	@Autowired()@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sf = sessionFactory;
    }
	
	public List<Resources> showList(DetachedCriteria dc,LimitPojo lp) {
		Session session = sf.openSession();
		Criteria c = dc.getExecutableCriteria(session);
		c.setFirstResult(lp.getPageNumber()*lp.getPageSize());
		c.setMaxResults(lp.getPageSize());
		List<Resources> list = c.list();
		return list;
	}

	public int count(LimitPojo lp) {
		DetachedCriteria dc = DetachedCriteria.forClass(Resources.class);
		if(lp.getName()!=null&& !"".equals(lp.getName())) {
			dc.add(Restrictions.like("res_name","%"+lp.getName()+"%"));
		}
		Session session = sf.openSession();
		Criteria c = dc.getExecutableCriteria(session);
		Long count = (Long) c.setProjection(Projections.rowCount()).uniqueResult();
		return count.intValue();
	}


}
