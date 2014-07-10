package com.tryflysky.numberon;
import static org.junit.Assert.*;

import org.junit.Test;

import com.tryflysky.numberon.Analyzer;
import com.tryflysky.numberon.Result;


public class AnalyzerTest {

	@Test
	public void test() {

		final int ANSWER = 0;
		final int GUESS = 1;
		final int RESULT = 2;


		String[][] answer_guess_expect = {
				{"183", "853", "1EAT, 1BITE"},
				{"235", "523", "3BITE"},

				{"188", "853", "1BITE"},
				{"818", "853", "1EAT"},
				{"118", "121", "1EAT, 1BITE"},
				{"118", "111", "2EAT"},

				{"118", "118", "3EAT"},

				{"123", "456", "Not even close!"},

				{"954", "951", "2EAT"},
				{"005", "512", "1BITE"},
//				{"112", "221", "3BITE"},
		};

		for(String[] test : answer_guess_expect) {

			Analyzer analyzer = new Analyzer(test[ANSWER]);

			Result actual = analyzer.analyze(test[GUESS]);

			System.out.println(actual.toString());
			assertEquals(test[RESULT], actual.toString());
		}

	}

}
