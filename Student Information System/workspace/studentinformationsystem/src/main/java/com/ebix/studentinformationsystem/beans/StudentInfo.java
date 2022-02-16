package com.ebix.studentinformationsystem.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private Integer physicalExcercise;
	
	@Column
	private double average;
	
	@Column
	private String grade;
	
	
}
