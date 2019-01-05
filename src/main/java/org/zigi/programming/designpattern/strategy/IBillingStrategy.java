package org.zigi.programming.designpattern.strategy;

public interface IBillingStrategy {
	public double getPrice(final double rawPrice);
}
