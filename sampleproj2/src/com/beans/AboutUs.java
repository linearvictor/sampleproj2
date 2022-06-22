package com.beans;

public class AboutUs {

	private WebsiteCounter websiteCounter;

	private int count;

	public void setWebsiteCounter(WebsiteCounter websiteCounter) {
		this.websiteCounter = websiteCounter;
	}

	public void click() {
		count++;
		System.out.println("Total count on aboutus page is " + count);
		websiteCounter.count();
	}

}
