package com.leafsoft.persistance;
// Generated Dec 4, 2016 10:43:15 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Designations generated by hbm2java
 */
@Entity
@Table(name = "Designations", catalog = "userdb")
public class Designations implements java.io.Serializable {

	private Integer designationid;
	private String designationname;
	private int designationgroupid;
	private Boolean status;

	public Designations() {
	}

	public Designations(String designationname, int designationgroupid) {
		this.designationname = designationname;
		this.designationgroupid = designationgroupid;
	}

	public Designations(String designationname, int designationgroupid, Boolean status) {
		this.designationname = designationname;
		this.designationgroupid = designationgroupid;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "designationid", unique = true, nullable = false)
	public Integer getDesignationid() {
		return this.designationid;
	}

	public void setDesignationid(Integer designationid) {
		this.designationid = designationid;
	}

	@Column(name = "designationname", nullable = false, length = 100)
	public String getDesignationname() {
		return this.designationname;
	}

	public void setDesignationname(String designationname) {
		this.designationname = designationname;
	}

	@Column(name = "designationgroupid", nullable = false)
	public int getDesignationgroupid() {
		return this.designationgroupid;
	}

	public void setDesignationgroupid(int designationgroupid) {
		this.designationgroupid = designationgroupid;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}