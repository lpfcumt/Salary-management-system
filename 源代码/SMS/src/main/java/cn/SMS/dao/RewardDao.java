package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Reward;

public interface RewardDao extends BaseDao<Reward>{

	void deleteById(int rid);

	List<Reward> query1(int rid);

	void update1(int rid, Double rewardsum);

}
