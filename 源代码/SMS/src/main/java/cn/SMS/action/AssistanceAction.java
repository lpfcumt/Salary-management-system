package cn.SMS.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.SMS.model.Assistance;

@SuppressWarnings("serial")
public class AssistanceAction extends BaseAction<Assistance>{
		private String staffname;
		private int sid;
		public String getStaffname() {
			return staffname;
		}
		public void setStaffname(String staffname) {
			this.staffname = staffname;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		
		/*添加员工补助类型*/
		public String addAssistance() throws Exception{
			
			assistanceService.save(model);
			return SUCCESS;
		}
		
		/*修改员工补助类型*/
		public String updateAssistance() throws Exception{
			
			
			assistanceService.update1(model.getSid(),model.getCate1(),model.getCate2(),model.getCate3(),
					model.getCate4(),model.getCate5(),model.getCate6(),model.getCate7(),model.getCate8());
			return SUCCESS;
		}
		
		/*输出所有员工补助类型*/
		public String  listAllAssistance() throws Exception{
			session.put("listallassistance", assistanceService.query());
			return SUCCESS;
		}
		
		/*输出单个员工补助类型*/
		public String listAssistance() throws Exception{
			session.put("sid2", model.getSid());
			session.put("staffname2", model.getStaffname());
			session.put("listassistance", assistanceService.queryById(model.getSid()));
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("listassistance", assistanceService.queryById(model.getSid()));
			return SUCCESS;
		}
		
	
}
