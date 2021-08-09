package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import org.junit.jupiter.api.Test;

import com.jit.util.DbConUtil3;

public class TestSample7 {

	@Test
	public void testNormal() {
		assertAll(
				()->{
					assertNotNull(DbConUtil3.getCon());
				},
				()->{
					Connection con1,con2;
					con1=DbConUtil3.getCon();
					con2=DbConUtil3.getCon();
					assertSame(con1, con2);
				},
				()->{
					Connection con1,con2;
					con1=DbConUtil3.getCon();
					con2=DbConUtil3.getCon();
					if(con1==null && con2==null) {
						fail();
					}
				}
				);
		
	}

}