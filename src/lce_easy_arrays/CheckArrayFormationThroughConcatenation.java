package lce_easy_arrays;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayFormationThroughConcatenation {

	public static void main(String[] args) {
		int[] arr = { 15,88 };
		int[][] pieces = { {88},{15} };
		System.out.println(canFormArray(arr, pieces));

	}

	public static boolean canFormArray(int[] arr, int[][] pieces) {
		List<Integer> elements = new ArrayList<>();
		for (int k = 0; k < arr.length; k++) {
			elements.add(arr[k]);
		}

		for (int i = 0; i < pieces.length; i++) {
			int[] internalArr = pieces[i];
			if (internalArr.length == 1) {
				if (!elements.contains(internalArr[0])) {
					return false;
				}
			} else {
				if (!isSubArray(elements, internalArr)) {
					return false;
				}
			}
		}

		return true;

	}

	private static boolean isSubArray(List<Integer> elements, int[] internalArr) {
		int firstEle = 0;
		int count = 0;
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) == internalArr[firstEle]) {
				firstEle++;
				count++;
				if (count == internalArr.length) {
					return true;
				}
			} else {
				firstEle = 0;
				count = 0;
			}
		}
		return false;
	}

}
