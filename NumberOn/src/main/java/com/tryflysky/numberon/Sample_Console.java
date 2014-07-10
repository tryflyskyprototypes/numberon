package com.tryflysky.numberon;

import java.io.IOException;

import com.tryflysky.numberon.persona.Challenger;
import com.tryflysky.numberon.persona.ConsoleStrategy;
import com.tryflysky.numberon.persona.Host;

public class Sample_Console {


	public static void main(String[] args) throws IOException {


		System.out.println("### Example ###");
		System.out.println();

		String answer = "118";
		String guess = "121";

		System.out.println("1. Decide answer and set it to Host. This time, answer is " + answer);
		Host host = new Host(answer);

		System.out.println("2. Guess what the number is. This time, guess is " + guess);
		Challenger challenger = new Challenger(new ConsoleStrategy(), host);
		challenger.changeGuess(guess);

		System.out.println("3. Check your number and see result.");
		System.out.println();
		challenger.challenge();
		challenger.viewResult();

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Now, let's try!");
		System.out.println();
		host.changeAnswerAtRandom();

		while(challenger.isNotCrear()) {

			challenger.challenge();
			challenger.viewResult();

			System.out.println();
		}
	}

}
