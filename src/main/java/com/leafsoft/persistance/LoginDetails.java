package com.leafsoft.persistance;
// Generated Dec 4, 2016 10:43:15 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * LoginDetails generated by hbm2java
 */
@Entity
@Table(name = "LoginDetails", catalog = "userdb", uniqueConstraints = @UniqueConstraint(columnNames = "username") )
public class LoginDetails implements java.io.Serializable {

	private Integer id;
	private int userid;
	private String username;
	private String password;
	private String role;
	private Boolean status;

	public LoginDetails() {
	}

	public LoginDetails(int userid, String username, String role) {
		this.userid = userid;
		this.username = username;
		this.role = role;
	}

	public LoginDetails(int userid, String username, String password, String role, Boolean status) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "username", unique = true, nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role", nullable = false, length = 20)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
