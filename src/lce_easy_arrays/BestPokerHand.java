package lce_easy_arrays;

import java.util.HashMap;
import java.util.Map;

public class BestPokerHand {

	public static void main(String[] args) {
		int[] ranks = { 10,10,2,12,9};
		char[] suits = { 'a','b','c','a','d'};
		System.out.println(bestHand(ranks, suits));
	}

	public static String bestHand(int[] ranks, char[] suits) {
		int i;
		for (i = 1; i < suits.length; i++) {
			if (suits[i] !=suits[0]) {
				break;
			}
		}
		if (i == 5) {
			return "Flush";
		}
		Map<Integer, Integer> charCountMp = new HashMap<>();
		boolean isPair = false;
		for (int j = 0; j < ranks.length; j++) {
			if (charCountMp.containsKey(ranks[j])) {
				if (charCountMp.get(ranks[j]) == 1) {
					isPair = true;
				}
				if (charCountMp.get(ranks[j]) == 2) {
					return "Three of a Kind";
				}
				charCountMp.put(ranks[j], charCountMp.get(ranks[j]) + 1);
			} else {
				charCountMp.put(ranks[j], 1);
			}
		}
		return isPair ? "Pair" : "High Card";

	}

}
