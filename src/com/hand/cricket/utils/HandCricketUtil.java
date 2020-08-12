package com.hand.cricket.utils;

import java.util.Random;
import java.util.Scanner;

import com.hand.cricket.constants.AppConstants;

public class HandCricketUtil {

	public static Scanner hit = new Scanner(System.in);

	public int validateRun(int run, int delivery) {
		if (run < 1 || run > 6) {
			System.out.println(AppConstants.INVALID_RUN);
			validateRun(getRun(), delivery);
		}
		return run;
	}

	public int getRun() {
		int run = 0;
		try {
			run = hit.nextInt();
		} catch (Exception e) {
			System.out.println(AppConstants.GAME_OVER);
			System.exit(0);
		}
		return run;
	}

	public int player2Value() {
		Random random = new Random();
		int run = random.nextInt(6 - 1 + 1) + 1;
		return run;
	}

}
