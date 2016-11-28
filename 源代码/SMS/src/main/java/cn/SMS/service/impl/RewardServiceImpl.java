package cn.SMS.service.Impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.model.Reward;
import cn.SMS.service.RewardService;

@Transactional
@Lazy(true)
@Service("rewardService")
public class RewardServiceImpl extends BaseServiceImpl<Reward> implements RewardService{

}
