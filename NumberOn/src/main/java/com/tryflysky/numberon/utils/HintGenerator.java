package com.tryflysky.numberon.utils;

import java.util.Random;

public class HintGenerator {

	private final Random random = new Random();





	public String choiceOne(String _answer) {

		int digit = random.nextInt(_answer.length());

		return String.valueOf(_answer.charAt(digit));
	}
}
