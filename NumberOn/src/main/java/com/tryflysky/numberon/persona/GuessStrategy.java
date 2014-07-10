package com.tryflysky.numberon.persona;

import java.io.IOException;

public abstract class GuessStrategy {


	protected abstract String decideGuess() throws IOException;
}
