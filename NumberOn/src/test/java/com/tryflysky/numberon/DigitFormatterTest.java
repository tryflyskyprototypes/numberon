package com.tryflysky.numberon;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tryflysky.numberon.utils.DigitFormatter;

public class DigitFormatterTest {

	DigitFormatter digitFormatter = new DigitFormatter();


	@Test
	public void toSpecifyDigitString() {

		final int VALUE = 0;
		final int EXPECT = 1;

		String[][] value_expects = {

				{"1"  , "001"},
				{"11" , "011"},
				{"111", "111"},
		};


		for(String[] test : value_expects) {

			assertEquals(test[EXPECT], digitFormatter.toSpecifyDigitString(test[VALUE]));
		}
	}

}
