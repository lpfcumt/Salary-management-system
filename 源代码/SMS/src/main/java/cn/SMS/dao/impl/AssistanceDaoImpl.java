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

}
