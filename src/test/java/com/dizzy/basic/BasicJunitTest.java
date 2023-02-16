package com.dizzy.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicJunitTest {
	int a=2;
	@Test
	public void loadContext() {
		System.out.println("context loaded");
		assertEquals(2, a);
	}

}
