package com.ebix.studentinformationsystem.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "studentinfo2")
public class StudentInfo2 implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer hmt;
	
	private Integer fmm;
	
	private Integer mechatronics;
	
	private Integer fop;
	
	private Integer fmmLab;
	
	private double average2;
	
	private String grade2;
	
	private Integer rollNumber;
	
}
