package com.minorjava.week8.ci;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiApplicationTests {

	@Test
	void contextLoads() throws Error {
		throw new Error("error");
	}

}
