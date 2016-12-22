package cn.SMS.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.SMS.*;
import cn.SMS.model.Assistance;
import cn.SMS.model.Assistancesum;
import cn.SMS.model.Attendance;
import cn.SMS.model.Basesalary;
import cn.SMS.model.Job;
import cn.SMS.model.Reward;
import cn.SMS.model.Staff;
import cn.SMS.model.Totalsalary;
import cn.SMS.service.impl.AssistanceServiceImpl;
import cn.SMS.service.impl.AssistancesumServiceImpl;
import cn.SMS.service.impl.AttendanceServiceImpl;
import cn.SMS.service.impl.BasesalaryServiceImpl;
import cn.SMS.service.impl.DepartmentServiceImpl;
import cn.SMS.service.impl.JobServiceImpl;
import cn.SMS.service.impl.RewardServiceImpl;
import cn.SMS.service.impl.StaffServiceImpl;
import cn.SMS.service.impl.WagesumServiceImpl;


public class TotalsalaryAction extends BaseAction<Totalsalary>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	
	
	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	

	/*保存总工资*/
	public String saveTotalsalary() throws Exception{
		Calendar a=Calendar.getInstance();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		String adminname=(String)session.get("adminname");
		model.setAdminname(adminname);
		model.setTimes(time);
		model.setStatus("已结算");
		totalsalaryService.update1(model.getSid(),year,month,model.getAdminname(),model.getAssistancesum(),model.getBasesalarysum(),model.getDeductionsum(),
				model.getJobsum(),model.getRealsum(),model.getRewardsum(),model.getStatus(),model.getTip(),model.getTotalsum(),model.getTimes());
		return SUCCESS;
	}
	
	/*新建新月份的工资*/
	public String newTotalsalary() throws Exception{
				
		List<Staff> liststaff=totalsalaryService.query1();
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		List<Totalsalary> totalsalary=totalsalaryService.queryByTime(year,month);
		if (totalsalary.size()<1) {
			for(int i=0;i<liststaff.size();i++){
			Staff staff=liststaff.get(i);
			String status="未结算";
			model.setSid(staff.getSid());
			model.setStaffname(staff.getStaffname());
			model.setStatus(status);
			model.setYear(year);
			model.setMonth(month);
			model.setDepartment(staff.getDept());
			totalsalaryService.save(model);
			
			}
			return SUCCESS;
		}
		else{
			return ERROR;
		}
		
		
		
	}
	
	/*根据年份月份，输出未结算的员工*/
	public String listStaff() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		String status="未结算";
		model.setStatus(status);
		session.put("liststaff1", totalsalaryService.queryStaff(year,month,model.getStatus()));
		return SUCCESS;
	}
	
	/*根据年份、月份、部门输出员工工资*/
	public String listTotalsalaryByDept() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		String years=request.getParameter("year");
		int year;
		year=Integer.parseInt(years);
		String months=request.getParameter("month");
		int month;
		month=Integer.parseInt(months);
		session.put("listtotalsalary",totalsalaryService.querySalary(year,month,model.getDepartment()));
		return SUCCESS;
		
	}
	
	
	/*根据年份、月份、员工编号输出员工工资*/
	public String listTotalsalaryBySid() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		String years=request.getParameter("year");
		int year;
		year=Integer.parseInt(years);
		int sid=(int)session.get("staffid");
		session.put("listsalary", totalsalaryService.querySalary1(sid,year));
		return SUCCESS;
	}

	/*结算工资*/
	public String settleTotalsalary() throws Exception{
		Calendar a=Calendar.getInstance();
		String time=a.getCalendarType();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		String adminname=(String)session.get("adminname");
		model.setAdminname(adminname);
		session.put("status", "未结算");
		session.put("staffid", model.getSid());		
		List<Staff> liststaff=totalsalaryService.query2(model.getSid());
		Staff staff=liststaff.get(0);
		session.put("staffname1", staff.getStaffname());
		session.put("dept", staff.getDept());
		session.put("year", year);
		session.put("month", month);
		
		/*计算补助工资*/
		AssistanceServiceImpl assistanceServiceImpl= new AssistanceServiceImpl();
		AssistancesumServiceImpl assistancesumServiceImpl=new AssistancesumServiceImpl();
		List<Assistance> listassistance=totalsalaryService.query3(model.getSid());
		Assistance cate=listassistance.get(0);
		List<Assistancesum> listassistancesum=totalsalaryService.query4();
		Double assistancesum=0.0;
		String cate1=cate.getCate1();
		if(cate1.equals("是")){
			Assistancesum sum=listassistancesum.get(0);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate2().equals("是")){
			Assistancesum sum=listassistancesum.get(1);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate3().equals("是")){
			Assistancesum sum=listassistancesum.get(2);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate4().equals("是")){
			Assistancesum sum=listassistancesum.get(3);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate5().equals("是")){
			Assistancesum sum=listassistancesum.get(4);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate6().equals("是")){
			Assistancesum sum=listassistancesum.get(5);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate7().equals("是")){
			Assistancesum sum=listassistancesum.get(6);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		if(cate.getCate8().equals("是")){
			Assistancesum sum=listassistancesum.get(7);
			assistancesum=assistancesum+sum.getAssistancesum();
		}
		else {
			assistancesum=assistancesum+0;
		}
		session.put("assistancesum", assistancesum);
		model.setAssistancesum(assistancesum);
		
		/*计算基本工资*/
		BasesalaryServiceImpl basesalaryServiceImpl=new BasesalaryServiceImpl();
		List<Basesalary> listbasesalaty=totalsalaryService.query5(staff.getBasesalarycate());
		Basesalary basesalary=listbasesalaty.get(0);
		session.put("basesalarysum", basesalary.getBasesalarysum());
		model.setBasesalarysum(basesalary.getBasesalarysum());
		
		/*计算实扣工资*/
		AttendanceServiceImpl attendanceServiceImpl=new AttendanceServiceImpl();
		List<Attendance> listattendance=totalsalaryService.query6(model.getSid());
		Attendance attendance=listattendance.get(0);
		double dedutionsum=attendance.getDeduction1()+attendance.getDeduction2()+attendance.getDeduction3();
		session.put("deduction", dedutionsum);
		model.setDeductionsum(dedutionsum);
		
		/*计算职位工资*/
		JobServiceImpl jobServiceImpl=new JobServiceImpl(); 
		List<Job> listjobsum=totalsalaryService.query7(staff.getJob());
		Job job=listjobsum.get(0);
		session.put("jobsum", job.getJobsum());
		model.setJobsum(job.getJobsum());
		
		/*计算奖金*/
		RewardServiceImpl rewardServiceImpl=new RewardServiceImpl();
		List<Reward> listreward=totalsalaryService.query8();
		double rewardsum;
		Reward reward1=listreward.get(0);
		Reward reward2=listreward.get(1);
		Reward reward3=listreward.get(2);
		if (attendance.getLatetimes()<1 && attendance.getLeavetimes()<1 && attendance.getRealdays()==attendance.getShulddays() ) {
			rewardsum=reward1.getRewardsum();
		}
		else if (attendance.getLeavetimes()==1 && attendance.getLatetimes()==1  && 0<=attendance.getShulddays()-attendance.getRealdays() && attendance.getShulddays()-attendance.getRealdays()<=1) {
			rewardsum=reward2.getRewardsum();
		}
		else if (1<attendance.getLeavetimes() && attendance.getLeavetimes()<=3 && attendance.getLatetimes()<1  && 1<attendance.getShulddays()-attendance.getRealdays() && attendance.getShulddays()-attendance.getRealdays()<=3) {
			rewardsum=reward3.getRewardsum();
		}
		else {
			rewardsum=0.0;
		}
		session.put("rewardsum", rewardsum);
		model.setRewardsum(rewardsum);
		
		/*计算实际工资*/
		double totalsum=0.0;
		totalsum=basesalary.getBasesalarysum()+assistancesum+job.getJobsum()+rewardsum-dedutionsum;
		session.put("totalsum", totalsum);
		model.setRealsum(totalsum);
		
		session.put("department", staff.getDept());
		return SUCCESS;
		
	}

}
