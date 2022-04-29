package org.diligentsnail.hellolibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

	@Test
	void saysHello() {
		Hello hello = new Hello("HSE");

		assertEquals("Hi, HSE!", hello.sayHello());
	}
}
