package com.hy.designPattern.observer;

public class BankOfChinaObserver extends Observer{
	
	public BankOfChinaObserver(USDCNYRate usdcnyRate) {
		this.rate = usdcnyRate;
	}
	
	@Override
	public void update() {
		System.out.println("BankOfChina Observer The USD/CNY Rate Change to "+rate.getRate());
	}

}
