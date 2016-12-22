package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="totalsalary")
@Table(name="totalsalary")
public class Totalsalary {
	private int tid;
	private int year;
	private int month;
	private int sid;
	private String staffname;
	private Double basesalarysum;
	private Double jobsum;
	private Double rewardsum;
	private Double assistancesum;
	private Double wagesum;
	private Double deductionsum;
	private Double totalsum;
	private Double realsum;
	private String adminname;
	private String times;
	private String tip;
	private String status;
	private String department;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	@Column 
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Column 
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Column 
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Column 
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	
	@Column 
	public Double getBasesalarysum() {
		return basesalarysum;
	}
	public void setBasesalarysum(Double basesalarysum) {
		this.basesalarysum = basesalarysum;
	}
	
	@Column 
	public Double getJobsum() {
		return jobsum;
	}
	public void setJobsum(Double jobsum) {
		this.jobsum = jobsum;
	}
	
	@Column 
	public Double getRewardsum() {
		return rewardsum;
	}
	public void setRewardsum(Double rewardsum) {
		this.rewardsum = rewardsum;
	}
	
	@Column 
	public Double getAssistancesum() {
		return assistancesum;
	}
	public void setAssistancesum(Double assistancesum) {
		this.assistancesum = assistancesum;
	}
	
	@Column 
	public Double getWagesum() {
		return wagesum;
	}
	public void setWagesum(Double wagesum) {
		this.wagesum = wagesum;
	}
	
	@Column 
	public Double getDeductionsum() {
		return deductionsum;
	}
	public void setDeductionsum(Double deductionsum) {
		this.deductionsum = deductionsum;
	}
	
	@Column 
	public Double getTotalsum() {
		return totalsum;
	}
	public void setTotalsum(Double totalsum) {
		this.totalsum = totalsum;
	}
	
	@Column 
	public Double getRealsum() {
		return realsum;
	}
	public void setRealsum(Double realsum) {
		this.realsum = realsum;
	}
	
	@Column 
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	@Column 
	public String  getTimes() {
		return times;
	}
	
	public void setTimes(String times) {
		this.times = times;
	}
	
	@Column
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Column
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
