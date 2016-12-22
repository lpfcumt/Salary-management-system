package cn.SMS.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import cn.SMS.dao.BaseDao;
import cn.SMS.model.Assistance;
import cn.SMS.model.Assistancesum;
import cn.SMS.model.Attendance;
import cn.SMS.model.Basesalary;
import cn.SMS.model.Job;
import cn.SMS.model.Reward;
import cn.SMS.model.Staff;

@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class clazz; // clazz中存储了子类当前操作实体类型
	//获取连接
	@Resource(name="sessionFactory")
	protected SessionFactory sessionFactory;
	
	
	public BaseDaoImpl(){
		ParameterizedType type=(ParameterizedType)this.getClass().getGenericSuperclass();
		clazz=(Class)type.getActualTypeArguments()[0];
	}
	protected Session getSession(){
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;
	}
	//保存
	@Override
	public void save(T t) {
		getSession().save(t);		
	}
	
	/*
	@Override
	public void save1(ProjectsRepay t) {
		getSession().save(t);		
	}*/
	//更新
	@Override
	public void update(T t) {
		getSession().saveOrUpdate(t);
	}
	//根据Id删除
	@Override
	public void delete(int id) {
		/*String hql="DELETE FROM " + clazz.getSimpleName() + " c WHERE c.id=:id";
		getSession().createQuery(hql)
		.setParameter("id",id)
		.executeUpdate();*/
		getSession()
		.createQuery("delete " + clazz.getSimpleName()
			+ " en where en.id = ?0")
		.setParameter("0" , id)
		.executeUpdate();
	}
	//单表查询获取所有实体
	@Override
	public List<T> query() {
		String clazzName=clazz.getSimpleName();
		String name=clazzName.substring(0,1).toLowerCase() + clazzName.substring(1);
		String hql="from "+ name;
		return (List<T>)getSession().createQuery(hql).getResultList();
	}
	//根据id获取
	@Override
	public T get(int id) {
		return(T)getSession().get(clazz, id);
	}
	//分页查询
	@Override
	public List<T> findByPage(String hql, int page, int rows) {		
		return getSession().createQuery(hql)
				.setFirstResult((page-1)*rows)
				.setMaxResults(rows)
				.getResultList();
	}

	@Override
	public long count(String hql) {	
		List<?> l = getSession().createQuery(hql).getResultList();
			if (l != null && l.size() == 1 )
			{
				return (Long)l.get(0);
			}
			return 0;
	}

	@Override
	public void delete(T t) {
		getSession().delete(t);
	}
	@Override
	public List<T> findByHql(String hql) {
		// TODO Auto-generated method stub
		return (List<T>) this.getSession().createQuery(hql).getResultList();
	}
	
	public List<Staff> find(String hql){
		return (List<Staff>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Assistance> find1(String hql){
		return (List<Assistance>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Assistancesum> find2(String hql){
		return (List<Assistancesum>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Basesalary> find3(String hql){
		return (List<Basesalary>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Job> find4(String hql){
		return (List<Job>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Reward> find5(String hql){
		return (List<Reward>)this.getSession().createQuery(hql).getResultList();
	}
	public List<Attendance> find6(String hql){
		return (List<Attendance>)this.getSession().createQuery(hql).getResultList();
	}
	/*
	@SuppressWarnings("deprecation") 
	/*
	@Override
	public List<T> findByHql(String hql) {
		return (List<T>) this.getSession().createQuery(hql).getResultList();
	}
	@Override
	public void save3(CollectProject t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}
	@Override
	public void save4(SupportProject t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}*/
}
