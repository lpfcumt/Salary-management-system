package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Basesalary;

public interface BasesalaryDao extends BaseDao<Basesalary>{

	List<Basesalary> listCate();

}
