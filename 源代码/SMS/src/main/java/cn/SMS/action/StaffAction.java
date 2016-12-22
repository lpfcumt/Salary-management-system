package cn.SMS.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Else;
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
		HttpServletRequest request=ServletActionContext.getRequest();
		String basesalarycate=request.getParameter("basesalarycate");
		model.setBasesalarycate(basesalarycate);
		
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		
		model.setJointime(time);
		staffService.save(model);
		return SUCCESS;	
	}
	
	/*修改用户信息*/
	public String updateStaff() throws Exception{
		staffService.updateById(model.getSid(),model.getAddress(),model.getBasesalarycate(),model.getBirthday()
				,model.getDept(),model.getEmail(),model.getJob(),model.getSex(),model.getStaffname(),model.getTel());
		return SUCCESS;
	}
	
	/*删除用户*/
	public String deleteStaff() throws Exception{
		staffService.deleteById(model.getSid());
		return SUCCESS;
	}
	
	/*展示所有员工*/
	public String listAllStaff() throws Exception{
		session.put("listallstaff",staffService.query());
		return SUCCESS;
		
	}
	
	/*展示员工详细信息*/
	public String listStaff() throws Exception{
		
			
		session.put("liststaff", staffService.queryById(model.getSid()));
		return SUCCESS;		
}
	
	public String listStaff1() throws Exception{
		
		int sid=(int)session.get("staffid");		
		session.put("liststaff1", staffService.queryById(sid));
		return SUCCESS;		
}
	
	
	}
