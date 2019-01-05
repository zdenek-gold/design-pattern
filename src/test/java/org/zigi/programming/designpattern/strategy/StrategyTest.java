package org.zigi.programming.designpattern.strategy;

import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;

import org.junit.Test;

public class StrategyTest {

	private final double APPLE_PRICE = 0.55;
	private final double FLOUR_PRICE = 2.10;
	private final double CHIPS_PRICE = 0.75;
	private final double COLA_PRICE = 1.12;
	private final double PASTA_PRICE = 2.45;
	private final double OIL_PRICE = 1.35;

	private final DecimalFormat FORMATTER = new DecimalFormat("$###,###.###");

	@Test
	public void test() {
		Customer cus = new Customer();

		// shopping (day 1)
		cus.addItem(APPLE_PRICE, 320);
		cus.addItem(COLA_PRICE, 120);
		cus.addItem(OIL_PRICE, 480);
		cus.addItem(FLOUR_PRICE, 100);
		cus.addItem(CHIPS_PRICE, 550);
		cus.addItem(PASTA_PRICE, 280);

		// pay
		double sum1 = cus.getSum();
		System.out.println("Total sum: " + FORMATTER.format(sum1));
		cus.emptyShoppingCart();

		// shopping (day 2)
		cus.setStrategy(new HappyHourStrategy());
		cus.addItem(APPLE_PRICE, 320);
		cus.addItem(COLA_PRICE, 120);
		cus.addItem(OIL_PRICE, 480);
		cus.addItem(FLOUR_PRICE, 100);
		cus.addItem(CHIPS_PRICE, 550);
		cus.addItem(PASTA_PRICE, 280);

		double sum2 = cus.getSum();
		System.out.println("Total sum: " + FORMATTER.format(sum2));
		cus.emptyShoppingCart();

		assertTrue(sum2 < sum1);
	}

}
