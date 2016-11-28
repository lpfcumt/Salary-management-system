package cn.SMS.service.Impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import cn.SMS.service.BaseService;
import cn.SMS.dao.*;;


@SuppressWarnings("unchecked")
@Service("baseService")
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {
	
	private Class clazz; // clazz中存储了子类当前操作实体类型
	public BaseServiceImpl() {
		// 如果子类调用当前构造方法,this代表的是子类对象
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
	}
	protected BaseDao baseDao;   // baseDao=categoryDao || baseDao=accountDao || baseDao=forderDao
	
	@PostConstruct   // init方法是在构造方法与set注入之后执行, 也就是XML的: init-method=""
	public void init() throws Exception{
		// 1: 根据具体的泛型, 获取相应的Field字段, categoryDao
		String clazzName=clazz.getSimpleName();
		String clazzDaoName=clazzName.substring(0,1).toLowerCase() + clazzName.substring(1) + "Dao";
		Field clazzField=this.getClass().getSuperclass().getDeclaredField(clazzDaoName);
		// 2: 获取baseDao Filed字段
		Field baseField=this.getClass().getSuperclass().getDeclaredField("baseDao");
		// 3: 把categoryDao的值赋值给baseDao
		baseField.set(this,clazzField.get(this));
	}

/*
	@Resource(name="usersDao")
	protected UsersDao usersDao;
	@Resource(name="usersprojectDao")
	protected ProjectsDao usersprojectDao;
	*/
	@Resource(name="adminDao")
	protected AdminDao adminDao;
	@Resource(name="assistanceDao")
	protected AssistanceDao assistancedao;
	@Resource(name="assistanceSumDao")
	protected AssistanceSumDao assistanceSumDao;
	@Resource(name="attendanceDao")
	protected AttendanceDao attendanceDao;
	@Resource(name="baseSalaryDao")
	protected BaseSalaryDao baseSalaryDao;
	@Resource(name="departmentDao")
	protected DepartmentDao departmentDao;
	@Resource(name="jobDao")
	protected JobDao jobDao;
	@Resource(name="rewardDao")
	protected RewardDao rewardDao;
	@Resource(name="staffDao")
	protected StaffDao staffDao;
	@Resource(name="totalSalaryDao")
	protected TotalSalaryDao totalSalaryDao;
	@Resource(name="wageSumDao")
	protected WageSumDao wageSumDao;
	
	
	@Override
	public void save(T t) {
		baseDao.save(t);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public void delete(T t) {
		baseDao.delete(t);
	}

	@Override
	public void delete(int id) {
		baseDao.delete(id);
	}

	@Override
	public List<T> query() {
		return (List<T>)baseDao.query();
	}

	@Override
	public T get(int id) {
		return (T)baseDao.get(id);
	}

	@Override
	public List<T> findByPage(String hql, int page, int rows) {
		return (List<T>)baseDao.findByPage(hql, page, rows);
	}

	@Override
	public long count(String hql) {
		// TODO Auto-generated method stub
		return (Long)baseDao.count(hql);
	}

	/*
	@Override
	public void save1(ProjectsRepay t) {
		// TODO Auto-generated method stub
		baseDao.save(t);
	}

	@Override
	public void save3(CollectProject t) {
		// TODO Auto-generated method stub
		baseDao.save(t);
	}

	@Override
	public void save4(SupportProject t) {
		// TODO Auto-generated method stub
		baseDao.save(t);
	}	*/
}
