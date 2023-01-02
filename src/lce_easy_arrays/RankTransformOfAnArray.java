package lce_easy_arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RankTransformOfAnArray {

	public static void main(String[] args) {
		int[] arr = {37,12,28,9,100,56,80,5,12};
		System.out.println(Arrays.toString(arrayRankTransform(arr)));

	}

	public static int[] arrayRankTransform(int[] arr) {
		int[] resultArr = new int[arr.length];
		Map<Integer, Integer> rankingMap = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			rankingMap.put(arr[i], 0);
		}
		int count = 1;
		for (Entry<Integer, Integer> entry : rankingMap.entrySet()) {
			rankingMap.put(entry.getKey(), count);
			count++;
		}

		for (int i = 0; i < arr.length; i++) {
			resultArr[i] = rankingMap.get(arr[i]);
		}
		return resultArr;
	}

}
