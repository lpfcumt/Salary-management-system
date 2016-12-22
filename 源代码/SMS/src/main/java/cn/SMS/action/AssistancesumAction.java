package cn.SMS.action;

import cn.SMS.model.Assistancesum;

@SuppressWarnings("serial")
public class AssistancesumAction extends BaseAction<Assistancesum>{
	
	
	
	/*���²���������Ϣ*/
	public String updateAssistancesum() throws Exception{
		assistancesumService.update1(model.getAsid(),model.getName(),model.getAssistancesum());
		return SUCCESS;
	}
	
	/*ɾ����������*/
	public String deleteAssistancesum() throws Exception{
		assistancesumService.delete(model.getAsid());
		return SUCCESS;
	}
	
	/*������в�������*/
	public String listAssistancesum() throws Exception{
		session.put("listassistancesum", assistancesumService.query2());
		return SUCCESS;
	}
	
	/*���ͨ��ID*/
	public String listAssistancesumId() throws Exception{
		session.put("listasbyid", assistancesumService.query1(model.getAsid()));
		return SUCCESS;
	}
}
