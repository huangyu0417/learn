package com.hy.designPattern.observer;

public class BankOfHangzhouObserver extends Observer{
	
	public BankOfHangzhouObserver(USDCNYRate usdcnyRate) {
		this.rate = usdcnyRate;
	}
	@Override
	public void update() {
		System.out.println("BankOfHangzhou Observer The USD/CNY Rate Change to "+rate.getRate());
	}

}
