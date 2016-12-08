package cn.SMS.action;

import cn.SMS.model.Job;

public class JobAction extends BaseAction<Job>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*输出所有职位信息*/
	public String listJob() throws Exception{
		session.put("listjob", jobService.query());
		return SUCCESS;
	}
	
	/*修改职位信息*/
	public String updateJob() throws Exception{
		jobService.update(model);
		return SUCCESS;
	}
	
	/*添加职位信息*/
	public String addJob() throws Exception{
		jobService.save(model);
		return SUCCESS;
	}
	
	/*删除职位信息*/
	public String deleteJob() throws Exception{
		jobService.delete(model.getJid());
		return SUCCESS;
	}
}
