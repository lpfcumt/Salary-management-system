package cn.SMS.action;

import cn.SMS.model.Totalsalary;

public class TotalsalaryAction extends BaseAction<Totalsalary>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*�����ܹ���*/
	public String saveTotalsalary() throws Exception{
		totalsalaryService.save(model);
		return SUCCESS;
	}

}
