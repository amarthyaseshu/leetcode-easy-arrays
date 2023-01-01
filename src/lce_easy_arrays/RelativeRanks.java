package lce_easy_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RelativeRanks {

	public static void main(String[] args) {
		int[] score = { 10, 3, 8, 9, 4 };
		System.out.println(Arrays.toString(findRelativeRanks(score)));
	}

	public static String[] findRelativeRanks(int[] score) {
		Map<Integer, String> rankingMap = sortArrAdd(score);
		String[] resultArr = new String[score.length];
		for (int i = 0; i < score.length; i++) {
			resultArr[i] = rankingMap.get(score[i]);
		}
		return resultArr;

	}

	private static Map<Integer, String> sortArrAdd(int[] score) {
		Map<Integer, String> rankingMap = new HashMap<>();
		Set<Integer> integerSet = new TreeSet<>();
		for (int i = 0; i < score.length; i++) {
			integerSet.add(score[i]);
		}
		int count = 1;
		for (int val : integerSet) {
			if (integerSet.size() - count == 0) {
				rankingMap.put(val, "Gold Medal");
			} else if (integerSet.size() - count == 1) {
				rankingMap.put(val, "Silver Medal");
			} else if (integerSet.size() - count == 2) {
				rankingMap.put(val, "Bronze Medal");
			} else {
				rankingMap.put(val, String.valueOf((integerSet.size() - count) + 1));
			}
			count++;
		}
		return rankingMap;
	}

}
