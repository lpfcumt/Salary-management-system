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
		rewardService.update(model);
		return SUCCESS;
	}
	
	/*ɾ����������*/
	public String deleteReward() throws Exception{
		rewardService.delete(model.getRid());
		return SUCCESS;
	}
}
