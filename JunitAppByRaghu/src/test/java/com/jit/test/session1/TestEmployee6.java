package com.jit.test.session1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//Test case: A class that will test our code
@DisplayName("TESTING EMPLOYEE TASK")
public class TestEmployee6 {
	@Test
	@DisplayName("TESTING SAVE METHOD")
	public void testSave() {
		System.out.println("HELLO-SAVE");
	}

	@DisplayName("TESTING UPDATE METHOD")
	@Test
	@Disabled
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}
}
