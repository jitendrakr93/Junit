package com.jit.test.session1;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Test case: A class that will test our code
@TestMethodOrder(Alphanumeric.class)
public class TestEmployee2 {
	
	@Test
	public void testSave() {
		System.out.println("HELLO-SAVE");
	}
	
	@Test
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}
	
	@Test
	public void testDelete() {
		System.out.println("HELLO-DELETE");
	}
}
