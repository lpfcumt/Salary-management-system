package cn.SMS.dao.impl;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.JobDao;
import cn.SMS.model.Job;

@Repository("jobDao")
public class JobDaoImpl extends BaseDaoImpl<Job> implements JobDao{

}
