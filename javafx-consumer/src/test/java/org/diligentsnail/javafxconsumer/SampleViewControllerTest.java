package org.diligentsnail.javafxconsumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleViewControllerTest {
	@Test
	void sampleTest() {
		// Тест так себе, чтобы просто показать, что запустится хотя бы
		Assertions.assertDoesNotThrow(() -> {
			new SampleViewController();
			new SampleApplication();
		});
	}
}
