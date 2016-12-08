package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="basesalary")
@Table(name="basesalary")
public class Basesalary {
	private int bid;
	private String basesalarycate;
	private Double basesalarysum;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	@Column(nullable=false)
	public String getBasesalarycate() {
		return basesalarycate;
	}
	public void setBasesalarycate(String basesalarycate) {
		this.basesalarycate = basesalarycate;
	}
	
	@Column(nullable=false)
	public Double getBasesalarysum() {
		return basesalarysum;
	}
	public void setBasesalarysum(Double basesalarysum) {
		this.basesalarysum = basesalarysum;
	}
	
}
