package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AttendanceDao;
import cn.SMS.model.Attendance;
import cn.SMS.model.Staff;
@Repository("attendanceDao")
public class AttendanceDaoImpl extends BaseDaoImpl<Attendance> implements AttendanceDao{

	@Override
	public List<Attendance> queryById(int sid) {
		// TODO Auto-generated method stub
		String hql=" from attendance where sid='"+sid+"'";
		return findByHql(hql);
	}

	@Override
	public List<Attendance> queryByTime(int year,int month) {
		// TODO Auto-generated method stub
		String hql=" from attendance where year='"+year+"' and month='"+month+"'";
		return findByHql(hql);
	}

	@Override
	public List<Attendance> listAdBySid(int sid, int year) {
		// TODO Auto-generated method stub
		return findByHql(" from attendance where year='"+year+"' and sid='"+sid+"'");
	}

	@Override
	public List<Attendance> listStaff(int year, int month, String status) {
		// TODO Auto-generated method stub
		return findByHql("from attendance where year="+year+" and month="+month+" and status='"+status+"'");
	}

	@Override
	public void query(Double deduction1, Double deduction2, Double deduction3, Double latetimes, Double leavetimes,
			Double realdays, Double shulddays,int sid,int year,int month,String time,String status) {
		// TODO Auto-generated method stub
		String hql="update attendance s set s.deduction1="+deduction1+",s.deduction2="+deduction2+",s.deduction3="+deduction3+
				",s.latetimes='"+latetimes+"',s.leavetimes='"+leavetimes+"',s.realdays='"+realdays+"',s.shulddays='"+shulddays+"',s.status='"+status+"',s.time='"+time+"' where s.sid="+sid+
				" and s.year="+year+" and month="+month+"";
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public List<Staff> query1() {
		// TODO Auto-generated method stub
		return find("from staff");
	}

	@Override
	public void save1(int month, int sid, String staffname, String status, int year) {
		// TODO Auto-generated method stub
		String hql="insert into attendance(month,sid,staffname,status,year) select("+month+","+sid+",'"+staffname+"'"+",'"+status+"'"+","+year+")";
		getSession().createQuery(hql).executeUpdate();
	}

}
