package com.ssh.serviceImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssh.dao.ShowMenuListDao;
import com.ssh.pojo.LimitPojo;
import com.ssh.pojo.Resources;
import com.ssh.service.ShowMenuListService;

@Service("showMenuListService")
public class ShowMenuListServiceImpl implements ShowMenuListService {
	
	@Autowired()@Qualifier("showMenuListDao")
	private ShowMenuListDao smld;

	public LimitPojo showList(LimitPojo lp) {
		DetachedCriteria dc = DetachedCriteria.forClass(Resources.class);
		if(lp.getName()!=null&& !"".equals(lp.getName())) {
			dc.add(Restrictions.like("res_name","%"+lp.getName()+"%"));
		}
		List<Resources> list = smld.showList(dc,lp);
		int count = smld.count(lp);
		lp.setRows(list);
		lp.setTotal(count);
		return lp;
	}
	
}
