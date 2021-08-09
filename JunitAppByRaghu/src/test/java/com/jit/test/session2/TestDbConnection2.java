package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jit.util.DbConnection2;


public class TestDbConnection2 {

	private DbConnection2 dbc;
	private Connection con;

	@BeforeEach
	public void initData() {
		dbc=new DbConnection2();
	}

	@Test
	public void testGetCon() {
		assertDoesNotThrow(()->{
			con=dbc.getCon();
		});
		assertNotNull(con,"Connection is Not created, Please check!");
	}

	@AfterEach
	public void clean() {
		dbc = null;
		con = null;
	}

}