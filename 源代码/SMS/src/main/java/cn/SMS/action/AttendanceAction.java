package cn.SMS.action;

import java.util.Calendar;
import cn.SMS.model.Attendance;

@SuppressWarnings("serial")
public class AttendanceAction extends BaseAction<Attendance>{

	/*添加考勤*/
	public String addAttendance() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		String status="已考核";
		model.setTime(time);
		model.setYear(year);
		model.setMonth(month);
		model.setStatus(status);
		attendanceService.save(model);
		return SUCCESS;
	}
	
	/*修改考勤*/
	public String updateAttendance() throws Exception{
		attendanceService.update(model);
		return SUCCESS;
	}
	
	/*输出所有考勤内容*/
	public String listAllAttendance() throws Exception{
		session.put("listallattendance", attendanceService.query());
		return SUCCESS;
	}
	
	/*根据员工编号查询考勤内容*/
	public String listAttendance() throws Exception{
		session.put("listattendance", attendanceService.queryById(model.getSid()));
		return SUCCESS;
	}
	
	/*根据时间查询考勤*/
	public String listAdByTime() throws Exception{
		
		session.put("listadbytime", attendanceService.queryByTime(model.getYear(),model.getMonth()));
		return SUCCESS;
	}
	
	/*根据年份、员工编号查询考勤*/
}
