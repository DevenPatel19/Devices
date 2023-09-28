package com.codingdojo.devices;

public class Device {
	protected int battery;
	
	public Device() {
		battery = 100;
	}
	
	public void status() {
		System.out.println("Battery remaining: " + battery);
	}
}
