package cn.SMS.action;

import java.util.Calendar;
import cn.SMS.model.Attendance;

@SuppressWarnings("serial")
public class AttendanceAction extends BaseAction<Attendance>{

	/*��ӿ���*/
	public String addAttendance() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		String status="�ѿ���";
		model.setTime(time);
		model.setYear(year);
		model.setMonth(month);
		model.setStatus(status);
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
		
		session.put("listadbytime", attendanceService.queryByTime(model.getYear(),model.getMonth()));
		return SUCCESS;
	}
	
	/*������ݡ�Ա����Ų�ѯ����*/
}
