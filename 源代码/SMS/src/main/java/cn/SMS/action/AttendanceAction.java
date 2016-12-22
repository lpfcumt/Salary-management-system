package cn.SMS.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.SMS.dao.impl.StaffDaoImpl;
import cn.SMS.model.Attendance;
import cn.SMS.model.Staff;
import cn.SMS.service.impl.StaffServiceImpl;

@SuppressWarnings("serial")
public class AttendanceAction extends BaseAction<Attendance>{
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	

	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	

	/*添加考勤*/
	public String addAttendance() throws Exception{
		Calendar a=Calendar.getInstance();
		
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		String status="已考核";
		model.setTime(time);
		model.setYear(year);
		model.setMonth(month);
		model.setStatus(status);
		attendanceService.update(model.getDeduction1(),model.getDeduction2(),model.getDeduction3(),model.getLatetimes(),model.getLeavetimes(),model.getRealdays(),model.getShulddays(),
				model.getSid(),model.getYear(),model.getMonth(),model.getTime(),model.getStatus());
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
		HttpServletRequest request=ServletActionContext.getRequest();
		String years=request.getParameter("year");
		int year;
		year=Integer.parseInt(years);
		String months=request.getParameter("month");
		int month;
		month=Integer.parseInt(months);
		
		session.put("listadbytime", attendanceService.queryByTime(year,month));
		return SUCCESS;
	}
	
	/*根据年份、员工编号查询考勤*/
	public String listAdBySid() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		String years=request.getParameter("year");
		int year;
		year=Integer.parseInt(years);
		int sid=(int)session.get("staffid");
		session.put("listadbysid", attendanceService.listAdBySid(sid,year));
		return SUCCESS;
	}
	
	/*新建新月份考勤*/
	public String newAttendance() throws Exception{
		StaffServiceImpl staffServiceImpl=new StaffServiceImpl();
		
		List<Staff> liststaff=attendanceService.query1();
		Calendar a=Calendar.getInstance();
		
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		List<Attendance> attendance=attendanceService.queryByTime(year, month);
		if (attendance.size()==0) {
			for(int i=0;i<liststaff.size();i++){
				Staff staff=liststaff.get(i);
				String status="未考核";
				model.setSid(staff.getSid());
				model.setStaffname(staff.getStaffname());
				model.setStatus(status);
				model.setYear(year);
				model.setMonth(month);
				attendanceService.save(model);
				
			}
			return SUCCESS;
		}
		else {
			return ERROR;
		}
		
	}
	
	/*输出本月未考勤的员工*/
	public String listStaff() throws Exception{
		String status="未考核";
		Calendar a=Calendar.getInstance();
		
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		List<Attendance> attendances=attendanceService.listStaff(year, month, status);
		System.out.println(attendances);
		session.put("listunstaff", attendanceService.listStaff(year,month,status));
				
		return SUCCESS;
		
	}
	
	public String listStaff3() throws Exception{
		List<Staff> liststaff=attendanceService.query1();
		return null;
	}
}
