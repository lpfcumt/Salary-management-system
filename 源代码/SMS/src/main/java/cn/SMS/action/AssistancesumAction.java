package cn.SMS.action;

import cn.SMS.model.Assistancesum;

@SuppressWarnings("serial")
public class AssistancesumAction extends BaseAction<Assistancesum>{
	
	
	
	/*���²���������Ϣ*/
	public String updateAssistancesum() throws Exception{
		assistancesumService.update(model);
		return SUCCESS;
	}
	
	/*ɾ����������*/
	public String deleteAssistancesum() throws Exception{
		assistancesumService.delete(model.getAsid());
		return SUCCESS;
	}
	
	/*������в�������*/
	public String listAssistancesum() throws Exception{
		session.put("listassistancesum", assistancesumService.query());
		return SUCCESS;
	}
}
