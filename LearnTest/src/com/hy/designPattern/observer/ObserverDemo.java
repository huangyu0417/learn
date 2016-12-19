package com.hy.designPattern.observer;

public class ObserverDemo {
	public static void main(String[] args) throws Exception{
		USDCNYRate usdcnyRate = new USDCNYRate();
		usdcnyRate.setRate(6.83);
		AgriculturalBankObserver agriculturalBankObserver = new AgriculturalBankObserver(usdcnyRate);
		BankOfChinaObserver bankOfChinaObserver = new BankOfChinaObserver(usdcnyRate);
		BankOfHangzhouObserver bankOfHangzhouObserver = new BankOfHangzhouObserver(usdcnyRate);
		usdcnyRate.addObserver(agriculturalBankObserver);
		usdcnyRate.addObserver(bankOfChinaObserver);
		usdcnyRate.addObserver(bankOfHangzhouObserver);
		for(;;){
			int i = (int) (Math.random()*10);
			if(i%2 == 0){
				usdcnyRate.changeRate(usdcnyRate.getRate()+0.02);
			}else{
				usdcnyRate.changeRate(usdcnyRate.getRate()-0.02);
			}
			System.out.println("====================================");
			Thread.sleep(2000);
		}
	}
}	
