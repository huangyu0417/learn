package com.hy.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class USDCNYRate {
	private double rate;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void changeRate(double rate){
		this.rate = rate;
		noticeToObserver();
	}
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	private void noticeToObserver(){
		for(Observer observer : observers){
			observer.update();
		}
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
