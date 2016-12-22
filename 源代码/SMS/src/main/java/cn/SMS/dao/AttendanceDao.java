package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Attendance;
import cn.SMS.model.Staff;

public interface AttendanceDao extends BaseDao<Attendance>{

	List<Attendance> queryById(int sid);

	List<Attendance> queryByTime(int year,int month);

	List<Attendance> listAdBySid(int sid, int year);

	List<Attendance> listStaff(int year, int month, String status);

	void query(Double deduction1, Double deduction2, Double deduction3, Double latetimes, Double leavetimes,
			Double realdays, Double shulddays,int sid,int year,int month,String time,String status);

	List<Staff> query1();

	void save1(int month, int sid, String staffname, String status, int year);

}
