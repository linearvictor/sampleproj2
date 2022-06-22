package com.beans;

import java.util.Arrays;
import java.util.Map;

public class Student {
	
	private int sno;
	private String name;
	private Address address;
	private long[] mobile;
	private Map<String, Integer> marks;
	
	
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long[] getMobile() {
		return mobile;
	}
	public void setMobile(long[] mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", address=" + address + ", mobile=" + Arrays.toString(mobile)
				+ ", marks=" + marks + "]";
	}
	public Student(int sno, String name, Address address, long[] mobile) {
		super();
		this.sno = sno;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
