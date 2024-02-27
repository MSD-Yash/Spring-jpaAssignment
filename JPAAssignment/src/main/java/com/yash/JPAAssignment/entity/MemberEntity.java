package com.yash.JPAAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="member")
public class MemberEntity {
	
@Id
@Column(name="memberid")
private String memberid ;
private String name ;
private String gender;
private int age ;
private String mobileno;
private int joinyear ;
public String getMemberid() {
	return memberid;
}
public void setMemberid(String memberid) {
	this.memberid = memberid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public int getJoinyear() {
	return joinyear;
}
public void setJoinyear(int joinyear) {
	this.joinyear = joinyear;
}

}
