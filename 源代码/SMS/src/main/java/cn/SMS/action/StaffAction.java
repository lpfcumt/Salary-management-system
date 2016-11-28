package cn.SMS.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import cn.SMS.model.Staff;

public class StaffAction extends BaseAction<Staff>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	
	
	
	
	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}



	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}


	/*员工登录验证*/
	public String CheckStaff() throws Exception{
		String staffname=model.getStaffname();
		String tel=model.getTel();
		Staff staff=staffService.Query(staffname, tel);
		if (staff ==null){
			jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		return "CheckStaff";
	}
	
	/*添加员工*/
	public String AddStaff() throws Exception{
		staffService.save(model);
		return null;
		
	}
}
