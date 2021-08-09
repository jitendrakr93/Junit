package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.jit.util.DbConUtil3;


public class TestDbConUtil3 {

	@Test
	public void testGetCon() {
		Connection con1=DbConUtil3.getCon();
		Connection con2=DbConUtil3.getCon();

		//assertNotNull(con1,"Connection not created..");
		if(con1==null || con2==null ) {
			//TEST CASE IS FAILED
			fail("CONNECTIONS ARE NOT CRATED..");
		}
		assertSame(con1, con2,"May not be Same Connection!");
	}
}