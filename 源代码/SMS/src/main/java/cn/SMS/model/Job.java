package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="job")
@Table(name="job")
public class Job {
	private int jid;
	private String jobname;
	private Double jobsum;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	
	@Column(nullable=false)
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	
	@Column(nullable=false)
	public Double getJobsum() {
		return jobsum;
	}
	public void setJobsum(Double jobsum) {
		this.jobsum = jobsum;
	}
	
}
