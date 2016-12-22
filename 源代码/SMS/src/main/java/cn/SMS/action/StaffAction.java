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


	/*Ա����¼��֤*/
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
	
	/*Ա����¼*/
	public String loginStaff() throws Exception{
		
		String staffname=this.getUsername();
		String tel=this.getPassword();
		Staff staff=staffService.Query(staffname, tel);
		session.put("staffname", staffname);
		session.put("staffid", staff.getSid());
		
		return SUCCESS;
	}
	
	/*���Ա��*/
	public String AddStaff() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		
		model.setJointime(time);
		staffService.save(model);
		return SUCCESS;	
	}
	
	/*�޸��û���Ϣ*/
	public String updateStaff() throws Exception{
		staffService.update(model);
		return SUCCESS;
	}
	
	/*ɾ���û�*/
	public String deleteStaff() throws Exception{
		staffService.delete(model.getSid());
		return SUCCESS;
	}
	
	/*չʾ����Ա��*/
	public String listAllStaff() throws Exception{
		session.put("listallstaff",staffService.query());
		return SUCCESS;
		
	}
	
	/*չʾԱ����ϸ��Ϣ*/
	public String listStaff() throws Exception{
		int sid=(int)session.get("staffid");
		session.put("liststaff", staffService.queryById(sid));
		return SUCCESS;
	}
}
