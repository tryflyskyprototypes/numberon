package com.tryflysky.numberon.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.tryflysky.numberon.config.Config;

public class RandomNumberGenerator {

	private final Random random = new Random();

	private final int MAX_RANGE = 10;



	public String randomRange() {

		Set<Integer> no_overlap = new HashSet<Integer>();

		while(no_overlap.size() < Config.DIGIT) {

			no_overlap.add(random.nextInt(MAX_RANGE));
		}

		StringBuilder answer = new StringBuilder();

		for(Integer i : no_overlap) {

			answer.append(i);
		}

		return answer.toString();
	}








	//for test
	public static void main(String[] args) {

		RandomNumberGenerator r = new RandomNumberGenerator();

		System.out.println(r.randomRange());
	}
}
