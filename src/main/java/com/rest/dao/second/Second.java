package com.rest.dao.second;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "second_table")
public class Second {

	@Id
	@GeneratedValue
	@Column(name = "second_no")
	private Integer secondNo;

	@Column(name = "message")
	private String message;

	public Integer getSecondNo() {
		return secondNo;
	}

	public void setSecondNo(Integer secondNo) {
		this.secondNo = secondNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
