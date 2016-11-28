package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="department")
@Table(name="department")
public class Department {
	private int did;
	private String dept;
	private Double basesalary;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
	@Column(nullable=false)
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Column(nullable=false)
	public Double getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}
	
}
