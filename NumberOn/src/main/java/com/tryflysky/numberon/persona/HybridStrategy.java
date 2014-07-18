package com.tryflysky.numberon.persona;

import java.io.IOException;

public class HybridStrategy extends GuessStrategy {

	private int miss = 0;
	private GuessStrategy strategy = new ConsoleStrategy();
	
	
	@Override
	protected String decideGuess() throws IOException {
		
		String guess = strategy.decideGuess();
		
		miss++;
		if(miss == 3) {
			strategy = new IncrementalStrategy();
		}
		
		return guess;
	}

}
