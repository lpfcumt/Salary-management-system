package cn.SMS.action;

import java.util.HashMap;
import java.util.Map;

import cn.SMS.model.Admin;

public class AdminAction extends BaseAction<Admin>{

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	private String username;
	private String password;

	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}

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

	
	/*ºÏ≤È’À∫≈√‹¬Î*/
	public String CheckAdmin() throws Exception{
		String adminname=this.getUsername();
		String password=this.getPassword();
		Admin admin=adminService.Query(adminname,password);
		if (admin ==null){
			jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		return SUCCESS;
		
	}
	
	/*π‹¿Ì‘±µ«¬º*/
	public String loginAdmin() throws Exception{
		String adminname=this.getUsername();
		session.put("adminname",adminname);
		return SUCCESS;
	}
}
