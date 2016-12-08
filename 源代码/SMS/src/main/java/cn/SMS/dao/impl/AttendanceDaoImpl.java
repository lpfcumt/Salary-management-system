package cn.SMS.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AttendanceDao;
import cn.SMS.model.Attendance;
@Repository("attendanceDao")
public class AttendanceDaoImpl extends BaseDaoImpl<Attendance> implements AttendanceDao{

	@Override
	public List<Attendance> queryById(int sid) {
		// TODO Auto-generated method stub
		String hql=" from attendance where sid='"+sid+"'";
		return findByHql(hql);
	}

	@Override
	public List<Attendance> queryByTime(Date time) {
		// TODO Auto-generated method stub
		String hql=" from attendance where time='"+time+"'";
		return findByHql(hql);
	}

}
