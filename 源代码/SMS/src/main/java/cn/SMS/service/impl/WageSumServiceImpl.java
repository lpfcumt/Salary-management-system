package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.WageSum;
import cn.SMS.service.WageSumService;

@Transactional
@Lazy(true)
@Service("wageSumService")
public class WageSumServiceImpl extends BaseServiceImpl<WageSum> implements WageSumService{

}
