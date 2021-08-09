package com.jit.test.session1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

//Test case: A class that will test our code
@DisplayName("TESTING EMPLOYEE TASK")
public class TestEmployee7 {
	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	@DisplayName("MULTIPLE TEST")
	public void testMultiple(TestInfo info) {
		// System.out.println("HELLO:"+info.getTestClass().get().getName());
		// System.out.println("HELLO:"+info.getTestMethod().get().getName());
		System.out.println("HELLO:" + info.getDisplayName());
	}
}
