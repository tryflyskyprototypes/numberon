package com.tryflysky.numberon.persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * コンソールからの入力を受け付けて挑戦する人
 *
 * @author admin
 *
 */
public class ConsoleStrategy extends GuessStrategy {

	private final String PROMPT = "-> ";



	@Override
	protected String decideGuess() throws IOException {

		return sysoutPrompt();
	}





	private String sysoutPrompt() throws IOException {

		System.out.print(PROMPT);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		return input.readLine();
	}
}
