package cn.SMS.dao.Impl;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AttendanceDao;
import cn.SMS.model.Attendance;
@Repository("attendanceDao")
public class AttendanceDaoImpl extends BaseDaoImpl<Attendance> implements AttendanceDao{

}
