package com.hand.cricket.service;

import com.hand.cricket.constants.AppConstants;

public class MatchResult {

	/*
	 * This method is used decide the winner based on the use cases
	 *
	 */
	public void announceWinner(int player1Score, int player2Score, int spareBalls, Boolean isOut) {
		// player2 score more than player1 score
		if (player2Score > player1Score) {
			System.out.println(AppConstants.PLAYER2 + AppConstants.WINS_WITH + spareBalls + AppConstants.SPARE_BALLS);
		}
		// player1 score more than player2 and player2 is out
		else if (isOut && player1Score > player2Score) {
			System.out.println(AppConstants.PLAYER1 + AppConstants.WINS_BY + (player1Score - player2Score)
					+ AppConstants.RUN_FOR_DELIVERY);
		}
		// player1 score more than player2
		else if (player1Score > player2Score) {
			System.out.println(AppConstants.PLAYER1 + AppConstants.WINS_WITH + spareBalls + AppConstants.SPARE_BALLS);
		}

	}

}
