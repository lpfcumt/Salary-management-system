package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AssistancesumDao;
import cn.SMS.model.Assistancesum;

@Repository("assistancesumDao")
public class AssistancesumDaoImpl extends BaseDaoImpl<Assistancesum> implements AssistancesumDao{

	@Override
	public List<Assistancesum> query1(int asid) {
		// TODO Auto-generated method stub
		return findByHql("from AssistanceSum assistancesum where asid="+asid);
	}

	@Override
	public void update1(int asid, String name, Double assistancesum) {
		// TODO Auto-generated method stub
		String hql="update AssistanceSum a set a.name='"+name+"',a.assistancesum="+assistancesum+" where asid="+asid;
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public List<Assistancesum> query2() {
		// TODO Auto-generated method stub
		 String hql="from AssistanceSum assistancesum";
		 return findByHql(hql);
	}

}
