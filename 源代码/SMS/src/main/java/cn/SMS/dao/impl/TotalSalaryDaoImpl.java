package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.TotalsalaryDao;
import cn.SMS.model.Assistance;
import cn.SMS.model.Assistancesum;
import cn.SMS.model.Attendance;
import cn.SMS.model.Basesalary;
import cn.SMS.model.Job;
import cn.SMS.model.Reward;
import cn.SMS.model.Staff;
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

	@Override
	public List<Staff> query1() {
		// TODO Auto-generated method stub
		return find("from staff");
	}

	@Override
	public List<Staff> query2(int sid) {
		// TODO Auto-generated method stub
		return find("from staff where sid="+sid);
	}

	@Override
	public List<Assistance> query3(int sid) {
		// TODO Auto-generated method stub
		return find1("from assistance where sid="+sid);
	}

	@Override
	public List<Assistancesum> query4() {
		// TODO Auto-generated method stub
		return find2("from AssistanceSum assistancesum");
	}

	@Override
	public List<Basesalary> query5(String basesalarycate) {
		// TODO Auto-generated method stub
		return find3("from basesalary where basesalarycate='"+basesalarycate+"'");
	}

	@Override
	public List<Attendance> query6(int sid) {
		// TODO Auto-generated method stub
		return find6("from attendance where sid="+sid);
	}

	@Override
	public List<Job> query7(String job) {
		// TODO Auto-generated method stub
		return find4("from job where jobname='"+job+"'");
	}

	@Override
	public List<Reward> query8() {
		// TODO Auto-generated method stub
		return find5("from reward");
	}

	@Override
	public void update1(int sid, int year, int month, String adminname, Double assistancesum, Double basesalarysum,
			Double deductionsum, Double jobsum, Double realsum, Double realsum2, String status, String tip,
			Double totalsum,String times) {
		// TODO Auto-generated method stub
		String hql="update totalsalary s set s.adminname="+adminname+",s.assistancesum="+assistancesum+",s.basesalarysum="+basesalarysum+
				",s.deductionsum="+deductionsum+",s.jobsum="+jobsum+",s.realsum="+realsum+",s.status='"+status+"',s.tip='"+tip+"',s.rewardsum="+realsum2+",s.totalsum="+totalsum+",s.times='"+times+"' where s.sid="+sid+
				" and s.year="+year+" and month="+month+"";
		getSession().createQuery(hql).executeUpdate();
	}

}
