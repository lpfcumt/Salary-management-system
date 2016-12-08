package cn.SMS.action;

import cn.SMS.model.Department;

public class DepartmentAction extends BaseAction<Department>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*添加部门*/
	public String addDepartment() throws Exception{
		departmentService.save(model);
		return SUCCESS;
	}
	
	/*修改部门*/
	public String updateDepartment() throws Exception{
		departmentService.update(model);
		return SUCCESS;
	}
	
	/*输出所有部门*/
	public String listDepartment() throws Exception{
		session.put("listdepartment", departmentService.query());
		return SUCCESS;
		
	}
	
	/*删除部门信息*/
	public String deleteDepartment() throws Exception{
		departmentService.delete(model.getDid());
		return SUCCESS;
	}
}
