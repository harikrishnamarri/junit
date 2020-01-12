package com.nisum.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OrderserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sampleTest(){
		assertEquals("sarat",new OrderserviceApplication().sample());
	}
}
