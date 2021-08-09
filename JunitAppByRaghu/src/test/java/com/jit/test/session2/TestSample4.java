package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
public class TestSample4 {

	@Test
	public void testNormal() {
		int expected[] = {10,20,30};
		int actual[] = {10,20};
		assertArrayEquals(expected, actual,"Data may not be same in two arrays!");
	}

}