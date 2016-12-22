package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.SMS.model.Assistance;
import cn.SMS.model.Assistancesum;
import cn.SMS.model.Attendance;
import cn.SMS.model.Basesalary;
import cn.SMS.model.Job;
import cn.SMS.model.Reward;
import cn.SMS.model.Staff;
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

	@Override
	public List<Staff> query1() {
		// TODO Auto-generated method stub
		return totalsalaryDao.query1();
	}

	@Override
	public List<Staff> query2(int sid) {
		// TODO Auto-generated method stub
		return totalsalaryDao.query2(sid);
	}

	@Override
	public List<Assistance> query3(int sid) {
		// TODO Auto-generated method stub
		return totalsalaryDao.query3(sid);
	}

	@Override
	public List<Assistancesum> query4() {
		// TODO Auto-generated method stub
		return totalsalaryDao.query4();
	}

	@Override
	public List<Basesalary> query5(String basesalarycate) {
		// TODO Auto-generated method stub
		return totalsalaryDao.query5(basesalarycate);
	}

	@Override
	public List<Attendance> query6(int sid) {
		// TODO Auto-generated method stub
		return totalsalaryDao.query6(sid);
	}

	@Override
	public List<Job> query7(String job) {
		// TODO Auto-generated method stub
		return totalsalaryDao.query7(job);
	}

	@Override
	public List<Reward> query8() {
		// TODO Auto-generated method stub
		return totalsalaryDao.query8();
	}

	@Override
	public void update1(int sid, int year, int month, String adminname, Double assistancesum, Double basesalarysum,
			Double deductionsum, Double jobsum, Double realsum, Double rewardsum, String status, String tip,
			Double totalsum,String times) {
		// TODO Auto-generated method stub
		totalsalaryDao.update1(sid,year,month,adminname,assistancesum,basesalarysum,deductionsum,jobsum,realsum,rewardsum,status,tip,totalsum,times);
	}

}
