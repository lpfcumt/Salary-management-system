package cn.SMS.action;

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
			assistanceService.update(model);
			return SUCCESS;
		}
		
		/*输出所有员工补助类型*/
		public String  listAllAssistance() throws Exception{
			session.put("listallassistance", assistanceService.query());
			return SUCCESS;
		}
		
		/*输出单个员工补助类型*/
		public String listAssistance() throws Exception{
		
			session.put("listassistance", assistanceService.queryById(model.getAid()));
			return SUCCESS;
		}
}
