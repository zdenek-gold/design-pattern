package org.zigi.programming.designpattern.strategy;

public class StandardStrategy implements IBillingStrategy {

	public double getPrice(double rawPrice) {
		return rawPrice;
	}

}
