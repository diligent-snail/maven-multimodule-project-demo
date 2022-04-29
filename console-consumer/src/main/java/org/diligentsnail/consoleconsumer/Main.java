package org.diligentsnail.consoleconsumer;

import org.diligentsnail.hellolibrary.Hello;

public class Main {
	public static void main(String[] args) {
		String name = "BSE-207";
		if (args.length > 0) {
			name = args[0];
		}
		String hello = new Hello(name).sayHello();
		System.out.println(hello);
	}
}
