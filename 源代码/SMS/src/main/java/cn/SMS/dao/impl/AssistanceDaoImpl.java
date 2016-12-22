package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AssistanceDao;
import cn.SMS.model.Assistance;
@Repository("assistanceDao")
public class AssistanceDaoImpl extends BaseDaoImpl<Assistance> implements AssistanceDao{

	@Override
	public List<Assistance> queryById(int aid) {
		// TODO Auto-generated method stub
		String  hql=" from assistance where aid='"+aid+"'";
		return findByHql(hql);
	}

	@Override
	public void update1(int sid, String cate1, String cate2, String cate3, String cate4, String cate5, String cate6,
			String cate7, String cate8) {
		// TODO Auto-generated method stub
		String hql="update assistance a set a.cate1='"+cate1+"',a.cate2='"+cate2+"',a.cate3='"+cate3+"',a.cate4='"+cate4+"',a.cate5='"+cate5
				+"',a.cate6='"+cate6+"',a.cate7='"+cate7+"',a.cate8='"+cate8+"' where sid="+sid;
		getSession().createQuery(hql).executeUpdate();
	}

}
