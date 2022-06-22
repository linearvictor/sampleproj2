package com.beans;

public class Address {
	
	private int doorNo;
	private String line1;	
	private String line2;	
	private int pincode;
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(int doorNo, String line1, String line2, int pincode) {
		super();
		this.doorNo = doorNo;
		this.line1 = line1;
		this.line2 = line2;
		this.pincode = pincode;
		
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", line1=" + line1 + ", line2=" + line2 + ", pincode=" + pincode
				+ "]";
	}
	
	
	
	

}
