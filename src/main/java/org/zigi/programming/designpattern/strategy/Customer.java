package org.zigi.programming.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private List<Double> shoppingCart = new ArrayList<Double>();
	private IBillingStrategy strategy = new StandardStrategy();

	public void addItem(double value, int quantity) {
		shoppingCart.add(strategy.getPrice(value * quantity));
	}

	public double getSum() {
		double sum = 0.0;
		for (Double value : shoppingCart)
			sum += value;
		return sum;
	}

	public void emptyShoppingCart() {
		shoppingCart.clear();
	}

	public void setStrategy(final IBillingStrategy strategy) {
		this.strategy = strategy;
	}
}
