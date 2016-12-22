package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Job;

public interface JobDao extends BaseDao<Job>{

	List<Job> listJobsum(String jobname);

}
