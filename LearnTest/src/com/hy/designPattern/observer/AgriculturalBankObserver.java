package com.hy.designPattern.observer;

public class AgriculturalBankObserver extends Observer {
	
	public AgriculturalBankObserver(USDCNYRate usdcnyRate) {
		this.rate = usdcnyRate;
	}

	@Override
	public void update() {
		System.out.println("AgriculturalBank Observer The USD/CNY Rate Change to "+rate.getRate());
	}
}
