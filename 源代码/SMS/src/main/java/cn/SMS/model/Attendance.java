package cn.SMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.common.util.StringHelper;

@Entity(name="attendance")
@Table(name="attendance")
public class Attendance {
	private  int adid;
	private int year;
	private int month;
	private int sid;
	private String staffname;
	private Double shulddays;
	private Double realdays;
	private Double deduction1;
	private Double latetimes;
	private Double deduction2;
	private Double leavetimes;
	private Double deduction3;
	private String status;
	private String time;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	

	@Column(nullable=false)
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Column(nullable=false)
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Column(nullable=false)
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Column(nullable=false)
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	
	@Column(nullable=false)
	public Double getShulddays() {
		return shulddays;
	}
	public void setShulddays(Double shulddays) {
		this.shulddays = shulddays;
	}
	
	@Column(nullable=false)
	public Double getRealdays() {
		return realdays;
	}
	public void setRealdays(Double realdays) {
		this.realdays = realdays;
	}
	
	@Column(nullable=false)
	public Double getDeduction1() {
		return deduction1;
	}
	public void setDeduction1(Double deduction1) {
		this.deduction1 = deduction1;
	}
	
	@Column(nullable=false)
	public Double getLatetimes() {
		return latetimes;
	}
	public void setLatetimes(Double latetimes) {
		this.latetimes = latetimes;
	}
	
	@Column(nullable=false)
	public Double getDeduction2() {
		return deduction2;
	}
	public void setDeduction2(Double deduction2) {
		this.deduction2 = deduction2;
	}
	
	@Column(nullable=false)
	public Double getLeavetimes() {
		return leavetimes;
	}
	public void setLeavetimes(Double leavetimes) {
		this.leavetimes = leavetimes;
	}
	
	@Column(nullable=false)
	public Double getDeduction3() {
		return deduction3;
	}
	public void setDeduction3(Double deduction3) {
		this.deduction3 = deduction3;
	}
	@Column(nullable=false)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(nullable=false)
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
