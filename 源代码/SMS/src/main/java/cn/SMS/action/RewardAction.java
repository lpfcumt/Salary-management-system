package cn.SMS.action;

import cn.SMS.model.Reward;

public class RewardAction extends BaseAction<Reward>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*列出所有奖金类型*/
	public String listReward() throws Exception{
		session.put("listreward", rewardService.query());
		return SUCCESS;
	}
	
	/*添加奖金类型*/
	public String  addReward() throws Exception{
		rewardService.save(model);
		return SUCCESS;
	}
	
	/*修改奖金类型*/
	public String updateReward() throws Exception{
		rewardService.update(model);
		return SUCCESS;
	}
	
	/*删除奖金类型*/
	public String deleteReward() throws Exception{
		rewardService.delete(model.getRid());
		return SUCCESS;
	}
}
