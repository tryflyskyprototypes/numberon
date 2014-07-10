package com.tryflysky.numberon.persona;

import java.io.IOException;

import com.tryflysky.numberon.Result;



/**
 * 挑戦者、答えを予想する人
 *
 * 答えを知る人（Host）に予想を告げ、結果を貰う
 *
 * @author admin
 *
 */
public class Challenger {


	private final String CORRECT = "Correct! (≧▽≦)";
	private final String WRONG = "Wrong...(; ;)";

	private Host _host;
	private GuessStrategy _strategy;

	private String _guess;
	private Result _result;
	private boolean _clear = false;


	public Challenger(GuessStrategy strategy, Host host) {

		chengeHost(host);
		changeStrategy(strategy);
	}




	public void chengeHost(Host host) {

		this._host = host;
	}



	private void changeStrategy(GuessStrategy strategy) {

		this._strategy = strategy;
	}





	/**
	 * 指定した値に変更
	 * デモ用。
	 *
	 * @param guess
	 */
	public void changeGuess(String guess) {

		this._guess = guess;
	}




	public void challenge() throws IOException {

		_guess = _strategy.decideGuess();
		_result = _host.acceptChallenge(_guess);
		_clear = isRightAnswer();
	}




	public boolean isClear() {

		return _clear;
	}


	public boolean isNotCrear() {

		return ! isClear();
	}



	private boolean isRightAnswer() {

		return (_result.eatNum() == 3);
	}




	public void viewResult() {

		StringBuilder sb = new StringBuilder("# My guess is " + _guess + ". And the result is...");

		sb.append(_clear ? CORRECT : WRONG);

		System.out.println(sb.toString());
		System.out.println(_result.toString());
	}

}
