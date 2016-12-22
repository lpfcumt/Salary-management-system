package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Totalsalary;
import cn.SMS.service.TotalsalaryService;


@Service("totalsalaryService")
public class TotalsalaryServiceImpl extends BaseServiceImpl<Totalsalary> implements TotalsalaryService{

	@Override
	public List<Totalsalary> queryStaff(int year, int month, String status) {
		// TODO Auto-generated method stub
		return totalsalaryDao.queryStaff(year,month,status);
	}

	@Override
	public List<Totalsalary> queryByTime(int year, int month) {
		// TODO Auto-generated method stub
		return totalsalaryDao.queryByTime(year,month);
	}

	@Override
	public List<Totalsalary> querySalary(int year, int month, String department) {
		// TODO Auto-generated method stub
		return totalsalaryDao.querySalary(year,month,department);
	}

	@Override
	public List<Totalsalary> querySalary1(int sid, int year) {
		// TODO Auto-generated method stub
		return totalsalaryDao.querySalary1(sid,year);
	}

}
