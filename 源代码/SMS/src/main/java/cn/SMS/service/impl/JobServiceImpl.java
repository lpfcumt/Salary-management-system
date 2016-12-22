package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Job;
import cn.SMS.service.JobService;


@Service("jobService")
public class JobServiceImpl extends BaseServiceImpl<Job> implements JobService{

	@Override
	public List<Job> listJobsum(String jobname) {
		// TODO Auto-generated method stub
		return jobDao.listJobsum(jobname);
	}

	@Override
	public void deleteById(int jid) {
		// TODO Auto-generated method stub
		jobDao.deleteById(jid);
	}

}
