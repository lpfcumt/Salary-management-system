package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.Job;
import cn.SMS.service.JobService;

@Transactional
@Lazy(true)
@Service("jobService")
public class JobServiceImpl extends BaseServiceImpl<Job> implements JobService{

}
