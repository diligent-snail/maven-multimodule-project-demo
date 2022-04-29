package org.diligentsnail.hellolibrary;

public class Hello {
	private final String name;

	public Hello(String name) {
		if (name == null) {
			throw new IllegalArgumentException("name == null");
		}
		this.name = name;
	}

	public String sayHello() {
		return "Hi, " + name + "!";
	}
}
