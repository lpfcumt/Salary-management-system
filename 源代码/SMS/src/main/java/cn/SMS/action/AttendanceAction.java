package cn.SMS.action;

import java.util.Date;

import cn.SMS.model.Attendance;

@SuppressWarnings("serial")
public class AttendanceAction extends BaseAction<Attendance>{

	/*��ӿ���*/
	public String addAttendance() throws Exception{
		attendanceService.save(model);
		return SUCCESS;
	}
	
	/*�޸Ŀ���*/
	public String updateAttendance() throws Exception{
		attendanceService.update(model);
		return SUCCESS;
	}
	
	/*������п�������*/
	public String listAllAttendance() throws Exception{
		session.put("listallattendance", attendanceService.query());
		return SUCCESS;
	}
	
	/*����Ա����Ų�ѯ��������*/
	public String listAttendance() throws Exception{
		session.put("listattendance", attendanceService.queryById(model.getSid()));
		return SUCCESS;
	}
	
	/*����ʱ���ѯ����*/
	public String listAdByTime() throws Exception{
		Date time=new Date();
		session.put("listadbytime", attendanceService.queryByTime(time));
		return SUCCESS;
	}
}
