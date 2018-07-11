package com.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="studentotherino")
public class StudentOtherInfoBean implements Serializable{
	@Id
	@OneToOne                                                                                                                 
	@JoinColumn(name="id",referencedColumnName= "id")
	private StudentIndoBean stinfo;
	@Column(name="isadmin")
	private String isadmin;
	@Column(name="pass")
	private String password;
	public StudentIndoBean getStinfo() {
		return stinfo;
	}
	public void setStinfo(StudentIndoBean stinfo) {
		this.stinfo = stinfo;
	}
	public String getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
