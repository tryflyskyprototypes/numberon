package com.tryflysky.numberon.persona;

import java.io.IOException;

import com.tryflysky.numberon.utils.DigitFormatter;




/**
 * 挑戦者
 *
 * 正解するまで順に言っていく人
 *
 * @author admin
 *
 */
public class IncrementalStrategy extends GuessStrategy {

	private final DigitFormatter digitFormatter = new DigitFormatter();

	private int _current = 0;



	@Override
	protected String decideGuess() throws IOException {

		String guess = digitFormatter.toSpecifyDigitString(_current);

		_current++;

		return guess;
	}

}
