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
	private String satffname;
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
	
	@Column( nullable=false)
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Column( nullable=false)
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Column( nullable=false)
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Column( nullable=false)
	public String getSatffname() {
		return satffname;
	}
	public void setSatffname(String satffname) {
		this.satffname = satffname;
	}
	
	@Column( nullable=false)
	public Double getBasesalarysum() {
		return basesalarysum;
	}
	public void setBasesalarysum(Double basesalarysum) {
		this.basesalarysum = basesalarysum;
	}
	
	@Column( nullable=false)
	public Double getJobsum() {
		return jobsum;
	}
	public void setJobsum(Double jobsum) {
		this.jobsum = jobsum;
	}
	
	@Column( nullable=false)
	public Double getRewardsum() {
		return rewardsum;
	}
	public void setRewardsum(Double rewardsum) {
		this.rewardsum = rewardsum;
	}
	
	@Column( nullable=false)
	public Double getAssistancesum() {
		return assistancesum;
	}
	public void setAssistancesum(Double assistancesum) {
		this.assistancesum = assistancesum;
	}
	
	@Column( nullable=false)
	public Double getWagesum() {
		return wagesum;
	}
	public void setWagesum(Double wagesum) {
		this.wagesum = wagesum;
	}
	
	@Column( nullable=false)
	public Double getDeductionsum() {
		return deductionsum;
	}
	public void setDeductionsum(Double deductionsum) {
		this.deductionsum = deductionsum;
	}
	
	@Column( nullable=false)
	public Double getTotalsum() {
		return totalsum;
	}
	public void setTotalsum(Double totalsum) {
		this.totalsum = totalsum;
	}
	
	@Column( nullable=false)
	public Double getRealsum() {
		return realsum;
	}
	public void setRealsum(Double realsum) {
		this.realsum = realsum;
	}
	
	@Column( nullable=false)
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	@Column( nullable=false)
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
