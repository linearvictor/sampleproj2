package com.beans;

public class WebsiteCounter {
	
	private int count;
	
	
	
	public WebsiteCounter() {
		System.out.println("o : param constructor");
	}



	public void count() {
		count ++;
		System.out.println("Till now total visitor on website "+count );
	}

}
