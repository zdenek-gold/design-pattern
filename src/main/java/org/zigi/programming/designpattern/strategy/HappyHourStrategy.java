package org.zigi.programming.designpattern.strategy;

public class HappyHourStrategy implements IBillingStrategy {

	public double getPrice(double rawPrice) {
		return rawPrice * 0.8;
	}

}
