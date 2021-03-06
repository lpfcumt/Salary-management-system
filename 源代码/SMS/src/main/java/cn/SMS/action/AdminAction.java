package cn.SMS.action;

import java.util.HashMap;
import java.util.List;
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
	private String passwords;

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
	

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	/*����˺�����*/
	public String CheckAdmin() throws Exception{
		String adminname=this.getUsername();
		String password=this.getPasswords();
		Admin admin=adminService.Query(adminname,password);
		if (admin ==null){
			jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		return SUCCESS;
		
	}
	
	/*����Ա��¼*/
	public String loginAdmin() throws Exception{
		String adminname=this.getUsername();
		String password=this.getPasswords();
		Admin admin=adminService.Query(adminname,password);
		session.put("adminname",adminname);
		session.put("adminid", admin.getAdminid());
		return SUCCESS;
	}
}
