package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Reward;

public interface RewardService extends BaseService<Reward>{

	void deleteById(int rid);

	List<Reward> query1(int rid);

	void update1(int rid, Double rewardsum);

}
