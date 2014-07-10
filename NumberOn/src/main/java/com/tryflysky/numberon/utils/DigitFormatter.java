package com.tryflysky.numberon.utils;

import com.tryflysky.numberon.config.Config;

public class DigitFormatter {




	public String toSpecifyDigitString(String value) {

		final int value_digit = value.length();
		final int digit_diff = Config.DIGIT - value_digit;

		StringBuilder specifyDigit = new StringBuilder();

		for(int i = 0; i < digit_diff; i++) {

			specifyDigit.append(0);
		}

		specifyDigit.append(value);

		return specifyDigit.toString();
	}





	public String toSpecifyDigitString(int value) {

		return toSpecifyDigitString(String.valueOf(value));
	}
}
