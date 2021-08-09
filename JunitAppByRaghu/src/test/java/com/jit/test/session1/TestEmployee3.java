package com.jit.test.session1;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Test case: A class that will test our code
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee3 {
	
	@Test
	@Order(1)
	public void testSave() {
		System.out.println("HELLO-SAVE");
	}
	
	@Test
	@Order(2)
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}
	
	@Test
	@Order(3)
	public void testDelete() {
		System.out.println("HELLO-DELETE");
	}
}
