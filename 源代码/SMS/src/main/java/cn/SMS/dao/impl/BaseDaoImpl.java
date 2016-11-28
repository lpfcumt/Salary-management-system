package cn.SMS.dao.Impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import cn.SMS.dao.BaseDao;

@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class clazz; // clazz�д洢�����൱ǰ����ʵ������
	//��ȡ����
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
	//����
	@Override
	public void save(T t) {
		getSession().save(t);		
	}
	
	/*
	@Override
	public void save1(ProjectsRepay t) {
		getSession().save(t);		
	}*/
	//����
	@Override
	public void update(T t) {
		getSession().saveOrUpdate(t);
	}
	//����Idɾ��
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
	//�����ѯ��ȡ����ʵ��
	@Override
	public List<T> query() {
		String hql="FROM "+ clazz.getSimpleName();
		return (List<T>)getSession().createQuery(hql).getResultList();
	}
	//����id��ȡ
	@Override
	public T get(int id) {
		return(T)getSession().get(clazz, id);
	}
	//��ҳ��ѯ
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
		return null;
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
