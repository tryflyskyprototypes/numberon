package com.tryflysky.numberon.persona;

import com.tryflysky.numberon.Analyzer;
import com.tryflysky.numberon.Result;
import com.tryflysky.numberon.utils.HintGenerator;
import com.tryflysky.numberon.utils.RandomNumberGenerator;


/**
 * 答えを知っている人
 *
 * 挑戦者（Challenger）の挑戦を受け入れ結果を返す
 *
 * ・・・しか現在はしていないが
 * 番号をランダムに決定したり、挑戦者と駆け引きできるかも？と思いクラス化してある
 *
 * @author admin
 *
 */
public class Host {

	private final Analyzer _analyzer;
	private final RandomNumberGenerator numberGenerator = new RandomNumberGenerator();
	private final HintGenerator hintGenerator = new HintGenerator();


	private String _answer;
	private int round;






	public Host(String answer) {

		reset();
		this._answer = answer;
		_analyzer = new Analyzer(answer);
	}



	private void reset() {

		round = 1;
	}









	public Result acceptChallenge(String guess) {

		System.out.println("$ Try " + round);

		if(round % 10 == 0) {

			System.out.println("$ Hint. I have " + hintGenerator.choiceOne(_answer));
		}
		round++;

		return _analyzer.analyze(guess);
	}





	public void changeAnswerAtRandom() {

		reset();
		_answer = numberGenerator.randomRange();
		_analyzer.resetAnswer(_answer);

//		System.out.println("The new answer is " + _answer);
	}

}
