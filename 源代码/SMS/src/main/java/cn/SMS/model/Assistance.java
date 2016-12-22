package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="assistance")
@Table(name="assistance")
public class Assistance {
	private int aid;
	private int sid;
	private String staffname;
	private String cate1;
	private String cate2;
	private String cate3;
	private String cate4;
	private String cate5;
	private String cate6;
	private String cate7;
	private String cate8;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	@Column(nullable=false)
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
	public String getCate1() {
		return cate1;
	}
	public void setCate1(String cate1) {
		this.cate1 = cate1;
	}
	
	@Column
	public String getCate2() {
		return cate2;
	}
	public void setCate2(String cate2) {
		this.cate2 = cate2;
	}
	
	@Column
	public String getCate3() {
		return cate3;
	}
	public void setCate3(String cate3) {
		this.cate3 = cate3;
	}
	
	@Column
	public String getCate4() {
		return cate4;
	}
	public void setCate4(String cate4) {
		this.cate4 = cate4;
	}
	
	@Column
	public String getCate5() {
		return cate5;
	}
	public void setCate5(String cate5) {
		this.cate5 = cate5;
	}
	
	@Column
	public String getCate6() {
		return cate6;
	}
	public void setCate6(String cate6) {
		this.cate6 = cate6;
	}
	
	@Column
	public String getCate7() {
		return cate7;
	}
	public void setCate7(String cate7) {
		this.cate7 = cate7;
	}
	
	@Column
	public String getCate8() {
		return cate8;
	}
	public void setCate8(String cate8) {
		this.cate8 = cate8;
	}
	
	
	
}
