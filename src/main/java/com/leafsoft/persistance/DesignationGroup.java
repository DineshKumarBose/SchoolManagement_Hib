package com.leafsoft.persistance;
// Generated Dec 4, 2016 10:43:15 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DesignationGroup generated by hbm2java
 */
@Entity
@Table(name = "DesignationGroup", catalog = "userdb")
public class DesignationGroup implements java.io.Serializable {

	private Integer designationgroupid;
	private String designationgroupname;
	private Boolean status;

	public DesignationGroup() {
	}

	public DesignationGroup(String designationgroupname) {
		this.designationgroupname = designationgroupname;
	}

	public DesignationGroup(String designationgroupname, Boolean status) {
		this.designationgroupname = designationgroupname;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "designationgroupid", unique = true, nullable = false)
	public Integer getDesignationgroupid() {
		return this.designationgroupid;
	}

	public void setDesignationgroupid(Integer designationgroupid) {
		this.designationgroupid = designationgroupid;
	}

	@Column(name = "designationgroupname", nullable = false, length = 100)
	public String getDesignationgroupname() {
		return this.designationgroupname;
	}

	public void setDesignationgroupname(String designationgroupname) {
		this.designationgroupname = designationgroupname;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
