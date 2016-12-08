package cn.SMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="staff")
@Table(name="staff")
public class Staff {
	private int sid;
	private String staffname;
	private String sex;
	private int age;
	private Date birthday;
	private String tel;
	private String email;
	private String address;
	private String dept;
	private String job;
	private double wage;
	private String basesalarycate;
	private Date jointime;
	private String image;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(nullable=false)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(nullable=false)
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Column(nullable=false)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Column(nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(nullable=false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(nullable=false)
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Column(nullable=false)
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(nullable=false)
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Column(nullable=false)
	public String getBasesalarycate() {
		return basesalarycate;
	}
	public void setBasesalarycate(String basesalarycate) {
		this.basesalarycate = basesalarycate;
	}
	
	@Column(nullable=false)
	public Date getJointime() {
		return jointime;
	}
	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}
	
	@Column(nullable=false)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
