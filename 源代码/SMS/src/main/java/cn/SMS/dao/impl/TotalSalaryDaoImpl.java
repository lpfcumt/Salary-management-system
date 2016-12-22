package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.TotalsalaryDao;
import cn.SMS.model.Totalsalary;

@Repository("totalsalaryDao")
public class TotalsalaryDaoImpl extends BaseDaoImpl<Totalsalary> implements TotalsalaryDao{

	@Override
	public List<Totalsalary> queryStaff(int year, int month, String status) {
		// TODO Auto-generated method stub
		return findByHql("from totalsalary where year='"+year+"' and month='"+month+"' and status='"+status+"'");
	}

	@Override
	public List<Totalsalary> queryByTime(int year, int month) {
		// TODO Auto-generated method stub
		return findByHql("from totalsalary where year='"+year+"' and month='"+month+"'");
	}

	@Override
	public List<Totalsalary> querySalary(int year, int month, String department) {
		// TODO Auto-generated method stub
		return findByHql("from totalsalary where year='"+year+"' and month='"+month+"' and department='"+department+"'");
	}

	@Override
	public List<Totalsalary> querySalary1(int sid, int year) {
		// TODO Auto-generated method stub
		return findByHql("from totalsalary where year='"+year+"' and sid='"+sid+"'");
	}

}
