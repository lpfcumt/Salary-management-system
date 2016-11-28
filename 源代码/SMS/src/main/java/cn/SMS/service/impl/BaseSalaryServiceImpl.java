package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.BaseSalary;
import cn.SMS.service.BaseSalaryService;

@Transactional
@Lazy(true)
@Service("baseSalaryService")
public class BaseSalaryServiceImpl extends BaseServiceImpl<BaseSalary> implements BaseSalaryService{

}
