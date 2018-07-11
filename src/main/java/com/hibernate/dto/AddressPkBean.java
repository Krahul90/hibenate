package com.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Embeddable
public class AddressPkBean implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name="id",referencedColumnName= "id")
	private StudentIndoBean stinfo;
	@Column(name="add_type")
	private String add_type;

	public StudentIndoBean getStinfo() {
		return stinfo;
	}

	public void setStinfo(StudentIndoBean stinfo) {
		this.stinfo = stinfo;
	}

	public String getAdd_type() {
		return add_type;
	}

	public void setAdd_type(String add_type) {
		this.add_type = add_type;
	}
}
