package cn.SMS.dao.Impl;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.DepartmentDao;
import cn.SMS.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
