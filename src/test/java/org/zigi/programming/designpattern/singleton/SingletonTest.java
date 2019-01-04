package org.zigi.programming.designpattern.singleton;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		Singleton instance = Singleton.getInstance();
		Singleton sameInstance = Singleton.getInstance();

		assertSame(instance, sameInstance);
	}

}
