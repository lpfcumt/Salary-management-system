package cn.SMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="AssistanceSum")
@Table(name="AssistanceSum")
public class Assistancesum {
	private int asid;
	private String assistancesumname;
	private Double assistancesum;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAsid() {
		return asid;
	}
	public void setAsid(int asid) {
		this.asid = asid;
	}
	
	@Column(nullable=false)
	public String getAssistancesumname() {
		return assistancesumname;
	}
	public void setAssistancesumname(String assistancesumname) {
		this.assistancesumname = assistancesumname;
	}
	
	@Column(nullable=false)
	public Double getAssistancesum() {
		return assistancesum;
	}
	public void setAssistancesum(Double assistancesum) {
		this.assistancesum = assistancesum;
	}
	
	
}
