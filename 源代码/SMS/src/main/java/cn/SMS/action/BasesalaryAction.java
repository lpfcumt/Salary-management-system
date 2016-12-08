package cn.SMS.action;

import java.util.List;

import cn.SMS.model.Basesalary;

public class BasesalaryAction extends BaseAction<Basesalary>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*添加基本工资种类*/
	public String addBasesalary() throws Exception{
		basesalaryService.save(model);
		return SUCCESS;
		
	}
	
	/*删除基本工资种类*/
	public String deleteBasesalary() throws Exception{
		basesalaryService.delete(model.getBid());
		return SUCCESS;
	}
	
	/*输出所有基本工资类型*/
	public String listBasesalary() throws Exception{
		session.put("listbasesalary", basesalaryService.query());
		return SUCCESS;
	}
	
	/*输出基本工资种类*/
	public String listBasesalarycate() throws Exception{
		session.put("listcate", basesalaryService.listCate());
		return SUCCESS;
		
	}
}
