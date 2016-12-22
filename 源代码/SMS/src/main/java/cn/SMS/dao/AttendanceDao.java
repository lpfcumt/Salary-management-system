package cn.SMS.dao;

import java.util.Date;
import java.util.List;

import cn.SMS.model.Attendance;

public interface AttendanceDao extends BaseDao<Attendance>{

	List<Attendance> queryById(int sid);

	List<Attendance> queryByTime(int year,int month);

}
