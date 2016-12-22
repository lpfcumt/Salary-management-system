package cn.SMS.action;

import cn.SMS.model.Reward;

public class RewardAction extends BaseAction<Reward>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*�г����н�������*/
	public String listReward() throws Exception{
		session.put("listreward", rewardService.query());
		return SUCCESS;
	}
	
	/*��ӽ�������*/
	public String  addReward() throws Exception{
		rewardService.save(model);
		return SUCCESS;
	}
	
	/*�޸Ľ�������*/
	public String updateReward() throws Exception{
		rewardService.update1(model.getRid(),model.getRewardsum());
		return SUCCESS;
	}
	
	/*ɾ����������*/
	public String deleteReward() throws Exception{
		rewardService.deleteById(model.getRid());
		return SUCCESS;
	}
	
	/*���ͨ��Id*/
	public String listRewardById() throws Exception{
		session.put("listrewardbyid", rewardService.query1(model.getRid()));
		return SUCCESS;
	}
}
