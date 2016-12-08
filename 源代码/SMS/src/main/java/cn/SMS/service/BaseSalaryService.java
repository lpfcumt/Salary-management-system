package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Basesalary;

public interface BasesalaryService extends BaseService<Basesalary> {

	List<Basesalary> listCate();

}
