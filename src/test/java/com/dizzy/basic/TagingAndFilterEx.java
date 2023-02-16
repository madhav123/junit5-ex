package com.dizzy.basic;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
public class TagingAndFilterEx {
	@Test
    @Tag("taxes")
    void testingTaxCalculation() {
		System.out.print("testingTaxCalculation");
    }
	@Test
    @Tag("taxes")
    void testingTaxCalculationnewregion() {
		System.out.print("testingTaxCalculationnewregion");
    }
	
	@Test
    @Tag("interest")
    void testingInterestCal() {
		System.out.print("testingInterestCal");
    }



}
