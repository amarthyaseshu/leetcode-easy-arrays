package lce_easy_arrays;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {

	public static void main(String[] args) {
		int[] nums = { 9, 5, 7, 8, 7, 9, 8, 2, 0, 7 };
		System.out.println(distinctAverages(nums));
	}

	public static int distinctAverages(int[] nums) {
		sortArr(nums);
		Set<Double> averages = new HashSet<>();
		for (int i = 0; i < nums.length / 2; i++) {
			averages.add(((double) (nums[i] + nums[nums.length - i - 1]) / (double) 2));
		}
		return averages.size();
	}

	private static void sortArr(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					nums[i] = nums[i] + nums[j];
					nums[j] = nums[i] - nums[j];
					nums[i] = nums[i] - nums[j];
				}
			}
		}

	}

}
