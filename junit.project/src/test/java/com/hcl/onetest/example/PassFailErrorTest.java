package com.hcl.onetest.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

class PassFailErrorTest {

	@Test
	void addition() {
		assertThat("addition", 1 + 1, is(equalTo(2)));
	}
	
	@Test
	void subtraction() {
		assertThat("subtraction", 2 - 1, is(equalTo(0)));
	}
	
	@Test
	void division() {
		assertThat(12 / 0, is(equalTo(1)));
	}
	
}