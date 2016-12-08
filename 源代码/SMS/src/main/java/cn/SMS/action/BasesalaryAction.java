package cn.SMS.action;

import java.util.List;

import cn.SMS.model.Basesalary;

public class BasesalaryAction extends BaseAction<Basesalary>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*��ӻ�����������*/
	public String addBasesalary() throws Exception{
		basesalaryService.save(model);
		return SUCCESS;
		
	}
	
	/*ɾ��������������*/
	public String deleteBasesalary() throws Exception{
		basesalaryService.delete(model.getBid());
		return SUCCESS;
	}
	
	/*������л�����������*/
	public String listBasesalary() throws Exception{
		session.put("listbasesalary", basesalaryService.query());
		return SUCCESS;
	}
	
	/*���������������*/
	public String listBasesalarycate() throws Exception{
		session.put("listcate", basesalaryService.listCate());
		return SUCCESS;
		
	}
}
