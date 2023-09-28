package com.codingdojo.devices;

public class Phone extends Device{

	 public void makeCall() {
	        if (battery >= 5) {
	            battery -= 5;
	            System.out.println("You make a call.");
	            status();
	        } else {
	            System.out.println("Battery critical!");
	        }
	    }

	    public void playGame() {
	        if (battery >= 25) {
	            battery -= 20;
	            System.out.println("You play a game.");
	            status();
	        } else {
	            System.out.println("Battery too low for gaming.");
	        }
	    }

	    public void charge() {
	        battery += 50;
	        if (battery > 100) {
	            battery = 100;
	        }
	    }
}
