package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.JobDao;
import cn.SMS.model.Job;

@Repository("jobDao")
public class JobDaoImpl extends BaseDaoImpl<Job> implements JobDao{

	@Override
	public List<Job> listJobsum(String jobname) {
		// TODO Auto-generated method stub
		return findByHql("select jobsum from job where jobname='"+jobname+"'");
	}

	@Override
	public void deleteById(int jid) {
		// TODO Auto-generated method stub
		String hql="delete from job where jid='"+jid+"'";
		getSession().createQuery(hql).executeUpdate();
	}

}
