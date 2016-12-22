package cn.SMS.action;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.SMS.model.Staff;

@Controller
@Scope("prototype")
public class StaffAction extends BaseAction<Staff>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	private String username;
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}



	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}


	/*员工登录验证*/
	public String CheckStaff() throws Exception{
		String staffname=this.getUsername();
		String tel=this.getPassword();
		Staff staff=staffService.Query(staffname, tel);
		
		if (staff ==null){
			jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		return "CheckStaff";
	}
	
	/*员工登录*/
	public String loginStaff() throws Exception{
		
		String staffname=this.getUsername();
		String tel=this.getPassword();
		Staff staff=staffService.Query(staffname, tel);
		session.put("staffname", staffname);
		session.put("staffid", staff.getSid());
		
		return SUCCESS;
	}
	
	/*添加员工*/
	public String AddStaff() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		
		model.setJointime(time);
		staffService.save(model);
		return SUCCESS;	
	}
	
	/*修改用户信息*/
	public String updateStaff() throws Exception{
		staffService.update(model);
		return SUCCESS;
	}
	
	/*删除用户*/
	public String deleteStaff() throws Exception{
		staffService.delete(model.getSid());
		return SUCCESS;
	}
	
	/*展示所有员工*/
	public String listAllStaff() throws Exception{
		session.put("listallstaff",staffService.query());
		return SUCCESS;
		
	}
	
	/*展示员工详细信息*/
	public String listStaff() throws Exception{
		int sid=(int)session.get("staffid");
		session.put("liststaff", staffService.queryById(sid));
		return SUCCESS;
	}
}
