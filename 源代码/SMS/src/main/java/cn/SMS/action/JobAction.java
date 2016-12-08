package cn.SMS.action;

import cn.SMS.model.Job;

public class JobAction extends BaseAction<Job>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*�������ְλ��Ϣ*/
	public String listJob() throws Exception{
		session.put("listjob", jobService.query());
		return SUCCESS;
	}
	
	/*�޸�ְλ��Ϣ*/
	public String updateJob() throws Exception{
		jobService.update(model);
		return SUCCESS;
	}
	
	/*���ְλ��Ϣ*/
	public String addJob() throws Exception{
		jobService.save(model);
		return SUCCESS;
	}
	
	/*ɾ��ְλ��Ϣ*/
	public String deleteJob() throws Exception{
		jobService.delete(model.getJid());
		return SUCCESS;
	}
}
