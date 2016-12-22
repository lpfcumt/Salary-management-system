package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Reward;
import cn.SMS.service.RewardService;


@Service("rewardService")
public class RewardServiceImpl extends BaseServiceImpl<Reward> implements RewardService{

	@Override
	public void deleteById(int rid) {
		// TODO Auto-generated method stub
		rewardDao.deleteById(rid);
	}

	@Override
	public List<Reward> query1(int rid) {
		// TODO Auto-generated method stub
		return rewardDao.query1(rid);
	}

	@Override
	public void update1(int rid, Double rewardsum) {
		// TODO Auto-generated method stub
		rewardDao.update1(rid,rewardsum);
	}

}
