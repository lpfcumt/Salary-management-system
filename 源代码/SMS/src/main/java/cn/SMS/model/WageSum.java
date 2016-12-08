package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="wagesum")
@Table(name="wagesum")
public class Wagesum {
	private int wage;
	private Double wagesum;
	
	@Id
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	@Column(nullable=false)
	public Double getWagesum() {
		return wagesum;
	}
	public void setWagesum(Double wagesum) {
		this.wagesum = wagesum;
	}
	
}
