package cn.SMS.action;

import cn.SMS.model.Department;

public class DepartmentAction extends BaseAction<Department>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*��Ӳ���*/
	public String addDepartment() throws Exception{
		departmentService.save(model);
		return SUCCESS;
	}
	
	/*�޸Ĳ���*/
	public String updateDepartment() throws Exception{
		departmentService.update(model);
		return SUCCESS;
	}
	
	/*������в���*/
	public String listDepartment() throws Exception{
		session.put("listdepartment", departmentService.query());
		return SUCCESS;
		
	}
	
	/*ɾ��������Ϣ*/
	public String deleteDepartment() throws Exception{
		departmentService.delete(model.getDid());
		return SUCCESS;
	}
}
