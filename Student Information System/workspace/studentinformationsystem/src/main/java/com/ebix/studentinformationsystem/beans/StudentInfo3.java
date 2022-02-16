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
@Table(name = "studentInfo3")
public class StudentInfo3 implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer engineeringGraphics;
	
	private Integer engineeringMechanics;
	
	private Integer autoCAD;
	
	private Integer creo;
	
	private Integer ansys;
	
	private double average3;
	
	private String grade3;
	
	private Integer rollNumber;
	
}
