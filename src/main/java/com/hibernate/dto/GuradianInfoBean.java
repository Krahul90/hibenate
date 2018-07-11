package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="guradianInfoBean")
public class GuradianInfoBean {
@Id
@OneToOne
@JoinColumn(name="id",referencedColumnName= "id")

private StudentIndoBean stinfo;
@Column(name="gfirstname")
private String gfirstname;
@Column(name="gmiddlename")
private String gmiddlename;
@Column(name="glastname")
private String glastname;
@Column(name="mobileno")
private long mobileno;

public StudentIndoBean getStinfo() {
	return stinfo;
}
public void setStinfo(StudentIndoBean stinfo) {
	this.stinfo = stinfo;
}
public String getGfirstname() {
	return gfirstname;
}
public void setGfirstname(String gfirstname) {
	this.gfirstname = gfirstname;
}
public String getGmiddlename() {
	return gmiddlename;
}
public void setGmiddlename(String gmiddlename) {
	this.gmiddlename = gmiddlename;
}
public String getGlastname() {
	return glastname;
}
public void setGlastname(String glastname) {
	this.glastname = glastname;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
}
