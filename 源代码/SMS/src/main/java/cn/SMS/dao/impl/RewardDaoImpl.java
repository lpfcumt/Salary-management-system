package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.RewardDao;
import cn.SMS.model.Reward;

@Repository("rewardDao")
public class RewardDaoImpl extends BaseDaoImpl<Reward> implements RewardDao{

	@Override
	public void deleteById(int rid) {
		// TODO Auto-generated method stub
		String hql="delete from reward where rid='"+rid+"'";
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public List<Reward> query1(int rid) {
		// TODO Auto-generated method stub
		return findByHql("from reward where rid="+rid);
	}

	@Override
	public void update1(int rid, Double rewardsum) {
		// TODO Auto-generated method stub
		String hql="update reward r set r.rewardsum="+rewardsum+" where rid="+rid;
		getSession().createQuery(hql).executeUpdate();
	}

}
