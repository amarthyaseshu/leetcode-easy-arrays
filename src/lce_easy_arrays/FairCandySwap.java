package lce_easy_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

	public static void main(String[] args) {
		int[] aliceSizes = {  2 };
		int[] bobSizes = { 1, 3 };
		System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));

	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		if (aliceSizes.length == 1) {
			return new int[] { aliceSizes[0], (getSumOfRemEle(-1,bobSizes) + aliceSizes[0]) / 2 };
		} else if (bobSizes.length == 1) {
			return new int[] { (getSumOfRemEle(-1,aliceSizes) + bobSizes[0]) / 2, bobSizes[0] };
		}
		Set<Integer> bobSizesSet = new HashSet<>();
		int bobSizesSum = 0;
		int aliceSizesSum = 0;
		for (int i = 0; i < bobSizes.length; i++) {
			if (aliceSizes.length == bobSizes.length) {
				aliceSizesSum += aliceSizes[i];
			}
			bobSizesSum += bobSizes[i];
			bobSizesSet.add(bobSizes[i]);
		}
		int halfSumOfArrs = ((aliceSizesSum == 0 ? (getSumOfRemEle(-1,aliceSizes)) : aliceSizesSum) + bobSizesSum) / 2;
		for (int i = 0; i < aliceSizes.length; i++) {
			if (bobSizesSet.contains(halfSumOfArrs - getSumOfRemEle(i, aliceSizes))) {
				return new int[] { aliceSizes[i], halfSumOfArrs - getSumOfRemEle(i, aliceSizes) };
			}
		}
		return bobSizes;

	}

	private static int getSumOfRemEle(int j, int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		} else {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i != j) {
					sum += arr[i];
				}
			}
			return sum;
		}
	}

//	private static int getSumOfArray(int[] arr) {
//		if (arr.length == 1) {
//			return arr[0];
//		} else {
//			int sum = 0;
//			for (int i = 0; i < arr.length; i++) {
//				sum += arr[i];
//			}
//			return sum;
//		}
//
//	}

}
