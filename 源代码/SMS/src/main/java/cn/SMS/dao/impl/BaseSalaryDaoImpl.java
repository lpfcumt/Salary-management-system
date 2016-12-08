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
		return findByHql("select salarycate from basesalary");
	}

}
