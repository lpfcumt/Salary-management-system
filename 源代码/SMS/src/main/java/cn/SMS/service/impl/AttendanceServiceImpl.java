package cn.SMS.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Attendance;
import cn.SMS.service.AttendanceService;


@Service("attendanceService")
public class AttendanceServiceImpl extends BaseServiceImpl<Attendance> implements AttendanceService{

	@Override
	public List<Attendance> queryById(int sid) {
		// TODO Auto-generated method stub
		return attendanceDao.queryById(sid);
	}

	@Override
	public List<Attendance> queryByTime(Date time) {
		// TODO Auto-generated method stub
		return attendanceDao.queryByTime(time);
	}
	
}
