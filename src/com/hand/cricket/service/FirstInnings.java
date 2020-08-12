package com.hand.cricket.service;

import com.hand.cricket.constants.AppConstants;
import com.hand.cricket.utils.HandCricketUtil;

public class FirstInnings {

	private int player1Score = 0;
	private static int target = 0;

	/*
	 * This method is used to show the game details before the game commencement
	 */
	public void gameDetails() {
		System.out.println(AppConstants.GAME_DETAILS);
		System.out.println(AppConstants.SEPARATOR);
		firstInnings();
	}

	/*
	 * This method is used to play the first innings
	 */
	public void firstInnings() {
		System.out.println(AppConstants.FIRST_INNINGS + 10 + AppConstants.NEW_LINE);
		System.out.println(AppConstants.SEPARATOR);
		System.out.println(AppConstants.FIRST_INNINGS_TITLE);
		System.out.println(AppConstants.INNINGS_SEPARATOR);
		HandCricketUtil util = new HandCricketUtil();
		for (int delivery = 1; delivery <= 10; delivery++) {
			System.out.println(AppConstants.RUN_FOR_DELIVERY + delivery);
			int run = 0;
			run = util.getRun();
			int player1Run = util.validateRun(run, delivery);
			int player2 = util.player2Value();
			if (player1Run == player2) {
				System.out.println(AppConstants.PLAYER1_THROWS + player1Run + AppConstants.NEW_LINE
						+ AppConstants.PLAYER2_THROWS + player2 + AppConstants.NEW_LINE + AppConstants.PLAYER1_SCORE
						+ player1Score + AppConstants.NEW_LINE + AppConstants.PLAYER1_OUT);
				System.out.println(AppConstants.SEPARATOR);
				break;
			} else {
				player1Score = player1Score + player1Run;
				System.out.println(
						AppConstants.PLAYER1_THROWS + player1Run + AppConstants.NEW_LINE + AppConstants.PLAYER2_THROWS
								+ player2 + AppConstants.NEW_LINE + AppConstants.PLAYER1_SCORE + player1Score);
				System.out.println(AppConstants.SEPARATOR);
			}
		}
		decideTarget();
	}

	/*
	 * This method is used to set target for second innings
	 * 
	 */
	public void decideTarget() {
		target = player1Score;
		if (player1Score == 0) {
			target = 1;
		}
		System.out.println(AppConstants.TARGET_TO_WIN + target);
		SecondInnings secondInnings = new SecondInnings();
		secondInnings.secondInnings(player1Score);
	}

}
