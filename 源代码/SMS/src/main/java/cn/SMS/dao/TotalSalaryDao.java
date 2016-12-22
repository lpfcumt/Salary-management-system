package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Assistance;
import cn.SMS.model.Assistancesum;
import cn.SMS.model.Attendance;
import cn.SMS.model.Basesalary;
import cn.SMS.model.Job;
import cn.SMS.model.Reward;
import cn.SMS.model.Staff;
import cn.SMS.model.Totalsalary;

public interface TotalsalaryDao extends BaseDao<Totalsalary>{

	List<Totalsalary> queryStaff(int year, int month, String status);

	List<Totalsalary> queryByTime(int year, int month);

	List<Totalsalary> querySalary(int year, int month, String department);

	List<Totalsalary> querySalary1(int sid, int year);

	List<Staff> query1();

	List<Staff> query2(int sid);

	List<Assistance> query3(int sid);

	List<Assistancesum> query4();

	List<Basesalary> query5(String basesalarycate);

	List<Attendance> query6(int sid);

	List<Job> query7(String job);

	List<Reward> query8();

	void update1(int sid, int year, int month, String adminname, Double assistancesum, Double basesalarysum,
			Double deductionsum, Double jobsum, Double realsum, Double realsum2, String status, String tip,
			Double totalsum,String times);

}
