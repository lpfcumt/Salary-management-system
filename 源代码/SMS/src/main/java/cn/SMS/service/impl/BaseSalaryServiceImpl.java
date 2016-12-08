package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Basesalary;
import cn.SMS.service.BasesalaryService;


@Service("basesalaryService")
public class BasesalaryServiceImpl extends BaseServiceImpl<Basesalary> implements BasesalaryService{

	@Override
	public List<Basesalary> listCate() {
		// TODO Auto-generated method stub
		return basesalaryDao.listCate();
	}

}
