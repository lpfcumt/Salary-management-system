package cn.SMS.service;

import java.util.Date;
import java.util.List;

import cn.SMS.model.Attendance;

public interface AttendanceService extends BaseService<Attendance> {

	List<Attendance> queryById(int sid);

	List<Attendance> queryByTime(Date time);

}
