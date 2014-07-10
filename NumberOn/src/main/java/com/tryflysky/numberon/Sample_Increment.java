package com.tryflysky.numberon;

import java.io.IOException;

import com.tryflysky.numberon.persona.Challenger;
import com.tryflysky.numberon.persona.Host;
import com.tryflysky.numberon.persona.IncrementalStrategy;

public class Sample_Increment {




	public static void main(String[] args) throws IOException {

		String answer = "954";

		Host host = new Host(answer);

		Challenger challenger = new Challenger(new IncrementalStrategy(), host);

		while(challenger.isNotCrear()) {

			challenger.challenge();
			challenger.viewResult();

			System.out.println();
		}

	}

}
