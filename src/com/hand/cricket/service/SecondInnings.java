package com.hand.cricket.service;

import com.hand.cricket.constants.AppConstants;
import com.hand.cricket.utils.HandCricketUtil;

public class SecondInnings {

	private Boolean isOut = false;

	private int player2Score = 0;

	/*
	 * This method is used to play the second innings
	 */
	public void secondInnings(int player1Score) {
		MatchResult result = new MatchResult();
		System.out.println(AppConstants.SECOND_INNINGS + 10 + AppConstants.NEW_LINE);
		System.out.println(AppConstants.SEPARATOR);
		System.out.println(AppConstants.SECOND_INNINGS_TITLE);
		System.out.println(AppConstants.INNINGS_SEPARATOR);
		HandCricketUtil util = new HandCricketUtil();
		for (int delivery = 1; delivery <= 10; delivery++) {
			System.out.println(AppConstants.BOWL + delivery);
			int run = 0;
			run = util.getRun();
			int player1 = util.validateRun(run, delivery);
			int player2Run = util.player2Value();
			if (player2Run == player1) {
				isOut = true;
				System.out.println(AppConstants.PLAYER1_THROWS + player1 + AppConstants.NEW_LINE
						+ AppConstants.PLAYER2_THROWS + player2Run + AppConstants.NEW_LINE + AppConstants.PLAYER2_SCORE
						+ player2Score + AppConstants.NEW_LINE + AppConstants.PLAYER2_OUT);
				System.out.println(AppConstants.SEPARATOR);
				result.announceWinner(player1Score, player2Score, (10 - delivery), isOut);
				break;
			}
			player2Score = player2Score + player2Run;
			if (player2Score >= player1Score) {
				System.out.println(
						AppConstants.PLAYER1_THROWS + player1 + AppConstants.NEW_LINE + AppConstants.PLAYER2_THROWS
								+ player2Run + AppConstants.NEW_LINE + AppConstants.PLAYER2_SCORE + player2Score);
				System.out.println(AppConstants.SEPARATOR);
				result.announceWinner(player1Score, player2Score, (10 - delivery), isOut);
				break;
			} else {
				System.out.println(
						AppConstants.PLAYER1_THROWS + player1 + AppConstants.NEW_LINE + AppConstants.PLAYER2_THROWS
								+ player2Run + AppConstants.NEW_LINE + AppConstants.PLAYER2_SCORE + player2Score);
				System.out.println(AppConstants.SEPARATOR);
			}
		}

	}

}