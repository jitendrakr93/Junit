package com.jit.boot.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
//@WebMvcTest // RestController
@AutoConfigureMockMvc
@TestPropertySource("classpath:application-test.properties")
public class SpringBootCurdUnitTestApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testCustSave() throws Exception {
		//1. Create Req object
		MockHttpServletRequestBuilder request=
		MockMvcRequestBuilders
		.post("/customer/save")
		.contentType(MediaType.APPLICATION_JSON)
		.content("{\"cname\":\"AJAY\",\"ctype\":\"ABCD\"}");
		
		
		//2. perform call
		MvcResult result=mockMvc
				.perform(request)
				.andReturn();
		
		//3. Read Response object
		MockHttpServletResponse response=
				result.getResponse();
		
		//4. call assert method
		assertNotNull(response.getContentAsString());
		//assertEquals("saved with:2", response.getContentAsString());
		if(!response.getContentAsString()
				.contains("saved with")) {
			fail("Customer Not saved");
		}
		
		assertEquals(200, response.getStatus());
		assertEquals("text/plain;charset=UTF-8", response.getContentType());
	}
	
	@Test
	public void testCustView() throws Exception {
		//1. create req
		MockHttpServletRequestBuilder 
		request=
		MockMvcRequestBuilders
		.get("/customer/view/101");
		
		//2. perform call
		MvcResult result=mockMvc
				.perform(request)
				.andReturn();
		
		//3. read respo
		MockHttpServletResponse response=
				result.getResponse();
		
		//4. assert calls
		assertEquals(200, response.getStatus());
		assertNotNull(response.getContentAsString());
		assertEquals("application/json;charset=UTF-8", response.getContentType());
	}
	

}
