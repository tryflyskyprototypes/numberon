package com.tryflysky.numberon.utils;

public class FlagCounter {




	public int countTrue(boolean[] flags) {

		return count(flags, true);
	}




	public int countFalse(boolean[] flags) {

		return count(flags, false);
	}





	private int count(boolean[] flags, boolean b) {

		int result = 0;

		for(int i = 0; i < flags.length; i++) {

			result += judgeIncrement(flags[i], b);
		}

		return result;
	}





	private int judgeIncrement(boolean b1, boolean b2) {

		return b1 == b2 ? 1 : 0;
	}

}
