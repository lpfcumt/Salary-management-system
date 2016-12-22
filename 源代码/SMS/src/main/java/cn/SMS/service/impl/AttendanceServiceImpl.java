package cn.SMS.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Attendance;
import cn.SMS.model.Staff;
import cn.SMS.service.AttendanceService;


@Service("attendanceService")
public class AttendanceServiceImpl extends BaseServiceImpl<Attendance> implements AttendanceService{

	@Override
	public List<Attendance> queryById(int sid) {
		// TODO Auto-generated method stub
		return attendanceDao.queryById(sid);
	}

	@Override
	public List<Attendance> queryByTime(int year,int month) {
		// TODO Auto-generated method stub
		return attendanceDao.queryByTime(year,month);
	}

	@Override
	public List<Attendance> listAdBySid(int sid, int year) {
		// TODO Auto-generated method stub
		return attendanceDao.listAdBySid(sid,year);
	}

	@Override
	public List<Attendance> listStaff(int year, int month, String status) {
		// TODO Auto-generated method stub
		return attendanceDao.listStaff(year,month,status);
	}

	@Override
	public void update(Double deduction1, Double deduction2, Double deduction3, Double latetimes, Double leavetimes,
			Double realdays, Double shulddays,int sid,int year,int month,String time,String status) {
		// TODO Auto-generated method stub
		attendanceDao.query(deduction1,deduction2,deduction3,latetimes,leavetimes,realdays,shulddays,sid,year,month,time,status);
	}

	@Override
	public List<Staff> query1() {
		// TODO Auto-generated method stub
		return attendanceDao.query1();
	}

	@Override
	public void save1(int month, int sid, String staffname, String status, int year) {
		// TODO Auto-generated method stub
		attendanceDao.save1(month,sid,staffname,status,year);
	}
	
}
