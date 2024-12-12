package com.project.bio_data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BD {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	private String date_of_birth;
	private String gender;
	private String father_name;
	private String mother_name;
	private String father_occupation;
	private String mother_occupation;
	private String highest_education;
	private String address;
	
	public BD() {
		
	}

	public BD(String name, String date_of_birth, String gender, String father_name, String mother_name,
			String father_occupation, String mother_occupation, String highest_education, String address) {
		super();
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.father_occupation = father_occupation;
		this.mother_occupation = mother_occupation;
		this.highest_education = highest_education;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getFather_occupation() {
		return father_occupation;
	}

	public void setFather_occupation(String father_occupation) {
		this.father_occupation = father_occupation;
	}

	public String getMother_occupation() {
		return mother_occupation;
	}

	public void setMother_occupation(String mother_occupation) {
		this.mother_occupation = mother_occupation;
	}

	public String getHighest_education() {
		return highest_education;
	}

	public void setHighest_education(String highest_education) {
		this.highest_education = highest_education;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

