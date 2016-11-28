package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="reward")
@Table(name="reward")
public class Reward {
	private int rid;
	private String rewardgrade;
	private Double rewardsum;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	@Column(nullable=false)
	public String getRewardgrade() {
		return rewardgrade;
	}
	public void setRewardgrade(String rewardgrade) {
		this.rewardgrade = rewardgrade;
	}
	
	@Column(nullable=false)
	public Double getRewardsum() {
		return rewardsum;
	}
	public void setRewardsum(Double rewardsum) {
		this.rewardsum = rewardsum;
	}
	
}
