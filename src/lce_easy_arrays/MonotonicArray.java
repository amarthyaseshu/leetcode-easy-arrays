package lce_easy_arrays;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums = { 1,3,2 };
		System.out.println(isMonotonic(nums));
	}

	public static boolean isMonotonic(int[] nums) {
		boolean isChanged = false;
		boolean isDecreasingOrder = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				if (!isChanged) {
					if (nums[i] > nums[i + 1]) {
						isDecreasingOrder = true;
					} else {
						isDecreasingOrder = false;
					}
					isChanged = true;
				} else {
					if (nums[i] > nums[i + 1] && !isDecreasingOrder) {
						return false;
					} else if (nums[i] < nums[i + 1] && isDecreasingOrder) {
						return false;
					}
				}
			}
		}

		return true;

	}

}
