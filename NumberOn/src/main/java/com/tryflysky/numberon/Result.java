package com.tryflysky.numberon;

import com.tryflysky.numberon.utils.FlagCounter;
import com.tryflysky.utils.StringList;

public class Result {

	private final FlagCounter flagCounter = new FlagCounter();

	private final String EAT = "EAT";
	private final String BITE = "BITE";
	private final String NO_HIT = "Not even close!";

	private final boolean[] _eat;
	private final boolean[] _bite;




	public Result(boolean[] eat, boolean[] bite) {

		this._eat = eat;
		this._bite = bite;
	}





	public int eatNum() {
		return count(_eat);
	}





	public int biteNum() {
		return count(_bite);
	}





	@Override
	public String toString() {

		StringList hits = new StringList();
		hits.add(toString(eatNum(), EAT));
		hits.add(toString(biteNum(), BITE));

		String csv = hits.toCsvWithBlankIgnoreBlankElements();

		return csv.isEmpty() ? NO_HIT : csv;
	}




	private int count(boolean[] flags) {

		return flagCounter.countTrue(flags);
	}




	private String toString(int count, String unit) {

		return (count > 0) ? (count + unit) : "";
	}
}
