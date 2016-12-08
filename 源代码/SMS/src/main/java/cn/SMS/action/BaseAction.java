package cn.SMS.action;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import cn.SMS.service.AdminService;
import cn.SMS.service.AssistanceService;
import cn.SMS.service.AssistancesumService;
import cn.SMS.service.AttendanceService;
import cn.SMS.service.BasesalaryService;
import cn.SMS.service.DepartmentService;
import cn.SMS.service.JobService;
import cn.SMS.service.RewardService;
import cn.SMS.service.StaffService;
import cn.SMS.service.TotalsalaryService;
import cn.SMS.service.WagesumService;




public class BaseAction<T> extends ActionSupport implements RequestAware,SessionAware, ApplicationAware,ModelDriven<T>{
	private static final long serialVersionUID = 1L;
	//注入service

	/*@Resource(name="usersService")
	protected UsersService usersService;
	@Resource(name="usersprojectService")
	protected ProjectsService projectsService;*/
	
	@Resource(name="adminService")
	protected AdminService adminService;
	@Resource
	protected AssistanceService assistanceService;
	@Resource(name="assistancesumService")
	protected AssistancesumService assistancesumService;
	@Resource(name="attendanceService")
	protected AttendanceService attendanceService;
	@Resource(name="basesalaryService")
	protected BasesalaryService basesalaryService;
	@Resource(name="departmentService")
	protected DepartmentService departmentService;
	@Resource(name="jobService")
	protected JobService jobService;
	@Resource(name="rewardService")
	protected RewardService rewardService;
	@Resource
	protected StaffService staffService;
	@Resource(name="totalsalaryService")
	protected TotalsalaryService totalsalaryService;
	@Resource
	protected WagesumService wagesumService;
	//在调用构造方法的时候给model赋值
	protected T model;
	public BaseAction() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		Class clazz = (Class) type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//返回的对象将要压栈
	@Override
	public T getModel() {
		return model;
	}
	protected Map<String,Object> request;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application=application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	
	
	

}
