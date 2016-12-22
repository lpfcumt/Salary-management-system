package cn.SMS.action;

import cn.SMS.model.Assistancesum;

@SuppressWarnings("serial")
public class AssistancesumAction extends BaseAction<Assistancesum>{
	
	
	
	/*更新补助种类信息*/
	public String updateAssistancesum() throws Exception{
		assistancesumService.update1(model.getAsid(),model.getName(),model.getAssistancesum());
		return SUCCESS;
	}
	
	/*删除补助种类*/
	public String deleteAssistancesum() throws Exception{
		assistancesumService.delete(model.getAsid());
		return SUCCESS;
	}
	
	/*输出所有补助种类*/
	public String listAssistancesum() throws Exception{
		session.put("listassistancesum", assistancesumService.query2());
		return SUCCESS;
	}
	
	/*输出通过ID*/
	public String listAssistancesumId() throws Exception{
		session.put("listasbyid", assistancesumService.query1(model.getAsid()));
		return SUCCESS;
	}
}
