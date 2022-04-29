package org.diligentsnail.consoleconsumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {
	@Test
	void mainDoesNotThrow() {
		assertDoesNotThrow(() -> Main.main(new String[0]));
	}
}
