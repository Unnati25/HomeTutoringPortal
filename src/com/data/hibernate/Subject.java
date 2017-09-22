package com.data.hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@Table
public class Subject {
	
	@Id
	@Column(name="subject_id", nullable = false)
	private int subjecId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "category")
	private String category;

	public int getSubjecId() {
		return subjecId;
	}

	public void setSubjecId(int subjecId) {
		this.subjecId = subjecId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
