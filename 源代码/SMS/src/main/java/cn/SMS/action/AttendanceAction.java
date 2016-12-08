package cn.SMS.action;

import java.util.Date;

import cn.SMS.model.Attendance;

@SuppressWarnings("serial")
public class AttendanceAction extends BaseAction<Attendance>{

	/*添加考勤*/
	public String addAttendance() throws Exception{
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
		Date time=new Date();
		session.put("listadbytime", attendanceService.queryByTime(time));
		return SUCCESS;
	}
}
