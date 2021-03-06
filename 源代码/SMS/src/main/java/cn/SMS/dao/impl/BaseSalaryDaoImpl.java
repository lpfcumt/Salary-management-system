package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.BasesalaryDao;
import cn.SMS.model.Basesalary;

@Repository("basesalaryDao")
public class BasesalaryDaoImpl extends BaseDaoImpl<Basesalary> implements BasesalaryDao {

	@Override
	public List<Basesalary> listCate() {
		// TODO Auto-generated method stub
		return findByHql("select basesalarycate from basesalary");
	}

	@Override
	public List<Basesalary> listSum(String basesalarycate) {
		// TODO Auto-generated method stub
		return findByHql("select basesalarysum from basesalary where basesalarycate='"+basesalarycate+"'");
	}

	@Override
	public void deleteById(int bid) {
		// TODO Auto-generated method stub
		String hql="delete from basesalary where bid='"+bid+"'";
		getSession().createQuery(hql).executeUpdate();
	}

}
