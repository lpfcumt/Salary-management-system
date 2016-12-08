package cn.SMS.action;

import cn.SMS.model.Totalsalary;

public class TotalsalaryAction extends BaseAction<Totalsalary>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*保存总工资*/
	public String saveTotalsalary() throws Exception{
		totalsalaryService.save(model);
		return SUCCESS;
	}

}
