package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.TotalSalary;
import cn.SMS.service.TotalSalaryService;

@Transactional
@Lazy(true)
@Service("totalSalaryService")
public class TotalSalaryServiceImpl extends BaseServiceImpl<TotalSalary> implements TotalSalaryService{

}
