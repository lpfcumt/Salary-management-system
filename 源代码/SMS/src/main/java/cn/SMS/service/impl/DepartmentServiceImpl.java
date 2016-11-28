package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.Department;
import cn.SMS.service.DepartmentService;

@Transactional
@Lazy(true)
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{

}
