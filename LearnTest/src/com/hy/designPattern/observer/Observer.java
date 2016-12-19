package com.hy.designPattern.observer;

public abstract class Observer {
	protected USDCNYRate rate;
	public abstract void update();
}
