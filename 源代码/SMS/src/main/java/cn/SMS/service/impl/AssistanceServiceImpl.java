package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.Assistance;
import cn.SMS.service.AssistanceService;

@Transactional
@Lazy(true)
@Service("assistanceService")
public class AssistanceServiceImpl extends BaseServiceImpl<Assistance> implements AssistanceService{

}
