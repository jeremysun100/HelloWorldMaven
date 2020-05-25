package org.example.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test_Fizz() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Fizz", hw.fizzBuzz(9));
	}

	@Test
	public void test_Buzz() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Buzz", hw.fizzBuzz(5));
	}
}