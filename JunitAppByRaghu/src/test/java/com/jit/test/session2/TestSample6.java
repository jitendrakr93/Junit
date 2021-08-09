package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestSample6 {

	@Test
	public void testNormal() {
		assertThrows(NullPointerException.class, ()->{
			throw new ArrayIndexOutOfBoundsException();
		});
		
	}

}