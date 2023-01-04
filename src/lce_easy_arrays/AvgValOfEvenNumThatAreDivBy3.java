package lce_easy_arrays;

public class AvgValOfEvenNumThatAreDivBy3 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 7, 10 };
		System.out.println(averageValue(nums));
	}

	public static int averageValue(int[] nums) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
				sum += nums[i];
				count++;
			}
		}
		return sum > 0 ? ((int) sum / count) : 0;
	}

}
