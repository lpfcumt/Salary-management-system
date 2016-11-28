package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.AssistanceSum;
import cn.SMS.service.AssistanceSumService;

@Transactional
@Lazy(true)
@Service("assistanceSumService")
public class AssistanceSumServiceImpl extends BaseServiceImpl<AssistanceSum> implements AssistanceSumService{

}
