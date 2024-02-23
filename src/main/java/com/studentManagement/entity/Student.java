package com.studentManagement.entity;


import com.studentManagement.entity.semester.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {
	@Id
	private String id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email", unique = true)
	private String email;

	@Column(name="password")
	private String password;

	@Column(name= "teacher_id")
	private String teacherId;


	@OneToMany(mappedBy = "student")
	private List<first> first;
	@OneToMany(mappedBy = "student1")
	private List<second> second;
	@OneToMany(mappedBy = "student2")
	private List<com.studentManagement.entity.semester.third> third;
	@OneToMany(mappedBy = "student3")
	private List<fourth> fourth;

	@OneToMany(mappedBy = "student4")
	private List<com.studentManagement.entity.semester.fifth> fifth;
	@OneToMany(mappedBy = "student5")
	private List<sixth> sixth;
	@OneToMany(mappedBy = "student6")
	private List<seventh> seventh;
	@OneToMany(mappedBy = "student7")
	private List<eighth>  eighth;

	public Student() {
	}



	public Student(String id, String firstName, String lastName, String email, String teacherId, List<first> first,List<second> second,List<third> third,List<fourth> fourth,List<fifth> fifth,List<sixth> sixth,List<seventh> seventh,List<eighth> eighth)
	{
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.teacherId=teacherId;
		this.first=first;
		this.second=second;
		this.third=third;
		this.fourth=fourth;
		this.fifth=fifth;
		this.seventh=seventh;
		this.eighth=eighth;
	}

	public List<com.studentManagement.entity.semester.second> getSecond() {
		return second;
	}

	public void setSecond(List<com.studentManagement.entity.semester.second> second) {
		this.second = second;
	}

	public List<com.studentManagement.entity.semester.third> getThird() {
		return third;
	}

	public void setThird(List<com.studentManagement.entity.semester.third> third) {
		this.third = third;
	}

	public List<com.studentManagement.entity.semester.fourth> getFourth() {
		return fourth;
	}

	public void setFourth(List<com.studentManagement.entity.semester.fourth> fourth) {
		this.fourth = fourth;
	}

	public List<com.studentManagement.entity.semester.fifth> getFifth() {
		return fifth;
	}

	public void setFifth(List<com.studentManagement.entity.semester.fifth> fifth) {
		this.fifth = fifth;
	}

	public List<com.studentManagement.entity.semester.sixth> getSixth() {
		return sixth;
	}

	public void setSixth(List<com.studentManagement.entity.semester.sixth> sixth) {
		this.sixth = sixth;
	}

	public List<com.studentManagement.entity.semester.seventh> getSeventh() {
		return seventh;
	}

	public void setSeventh(List<com.studentManagement.entity.semester.seventh> seventh) {
		this.seventh = seventh;
	}

	public List<com.studentManagement.entity.semester.eighth> getEighth() {
		return eighth;
	}

	public void setEighth(List<com.studentManagement.entity.semester.eighth> eighth) {
		this.eighth = eighth;
	}

	public List<com.studentManagement.entity.semester.fourth> getFourths() {
		return fourth;
	}

	public void setFourths(List<com.studentManagement.entity.semester.fourth> fourth) {
		this.fourth = fourth;
	}

	public List<com.studentManagement.entity.semester.first> getFirst() {
		return first;
	}

	public void setFirst(List<com.studentManagement.entity.semester.first> first) {
		this.first = first;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}
