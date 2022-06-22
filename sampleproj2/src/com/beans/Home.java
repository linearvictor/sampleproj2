package com.beans;

public class Home {

	private WebsiteCounter websiteCounter;

	private int count;

	public void setWebsiteCounter(WebsiteCounter websiteCounter) {
		this.websiteCounter = websiteCounter;
	}

	public void click() {
		count++;
		System.out.println("Total count on home page is " + count);
		websiteCounter.count();
	}

}
