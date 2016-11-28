package cn.SMS.dao;

import java.util.List;

public interface BaseDao<T>{

	void save(T t);

	void update(T t);
	// 删除实体
	void delete(T t);
	//根据ID删除实体
	void delete(int id);
	// 仅仅查询当前对象, 不支持级联查询
	List<T> query();
	//根据ID加载实体
	T get(int id);
	//分页
	List<T> findByPage(String hql,int page,int rows);
	//查询总数
	long count(String hql);
	//根据条件查询
	List<T> findByHql(String hql);

	/*void save1(ProjectsRepay t);
	
	void save3(CollectProject t);
	
	void save4(SupportProject t);*/
}
