package com.ebix.studentinformationsystem.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "studentinfo")
public class StudentInfo implements Serializable{

	@Id
	@Column
	private Integer rollNumber;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Column
	private String bloodGroup;
	
	@Column
	private Integer english;
	
	@Column
	private Integer maths;
	
	@Column
	private Integer science;
	
	@Column
	private Integer computerScience;
	
	@Column
	private double average;
	
	@Column
	private String grade;
	
}
