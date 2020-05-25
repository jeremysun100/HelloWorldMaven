package org.example.helloworld;

import java.util.Arrays;

public class HelloWorld {

	public String fizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else {
			return "";
		}
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		Arrays.asList(100, 35, 9, 30).stream().forEach(a -> System.out.println(hw.fizzBuzz(a)));
	}
}
