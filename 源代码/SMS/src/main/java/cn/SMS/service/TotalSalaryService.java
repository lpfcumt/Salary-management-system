package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Totalsalary;

public interface TotalsalaryService extends BaseService<Totalsalary>{

	List<Totalsalary> queryStaff(int year, int month, String status);

	List<Totalsalary> queryByTime(int year, int month);

	List<Totalsalary> querySalary(int year, int month, String department);

	List<Totalsalary> querySalary1(int sid, int year);

}
