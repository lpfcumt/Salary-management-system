package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Job;

public interface JobService extends BaseService<Job>{

	List<Job> listJobsum(String jobname);

	void deleteById(int jid);

}
