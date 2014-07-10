package com.tryflysky.numberon;



public class Analyzer {

	private String _answer;




	public Analyzer(String answer) {

		resetAnswer(answer);
	}




	public void resetAnswer(String answer) {

		this._answer = answer;
	}




	public Result analyze(String guess) {

		boolean[] eats = toEatFlags(guess);

		String answer_no_eat = toNoEat(_answer, eats);
		String guess_no_eat = toNoEat(guess, eats);

		boolean[] bites = toBiteFlags(answer_no_eat, guess_no_eat);

		return new Result(eats, bites);
	}




	private boolean[] toEatFlags(String guess) {

		boolean[] eats = new boolean[_answer.length()];

		for(int i = 0; i < _answer.length(); i++) {

			eats[i] = (_answer.charAt(i) == guess.charAt(i));
		}

		return eats;
	}




	private boolean[] toBiteFlags(String answer_no_eat, String guess_no_eat) {

		boolean[] bites = new boolean[guess_no_eat.length()];

		for(int i = 0; i < bites.length; i++) {

			bites[i] = answer_no_eat.contains(String.valueOf(guess_no_eat.charAt(i)));
		}

		return bites;
	}




	private String toNoEat(String number, boolean[] eats) {

		StringBuilder no_eat = new StringBuilder();

		for(int i = 0; i < eats.length; i++) {

			no_eat.append(judgeEat(eats[i], number.charAt(i)));
		}

		return no_eat.toString();
	}




	private String judgeEat(boolean eat, char num) {

		return eat ? "" : String.valueOf(num);
	}
}
