package lce_easy_arrays;

public class CountEleWithStrictlySmallerAndGrtrEle {

	public static void main(String[] args) {
		int[] nums = { -3,3,3,90 };
		System.out.println(countElements(nums));
	}

	public static int countElements(int[] nums) {
		sortArray(nums);
		int firstEle = nums[0];
		int lastEle = nums[nums.length - 1];
		int count = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] != firstEle && nums[i] != lastEle) {
				count++;
			}
		}
		return count;

	}

	private static void sortArray(int[] nums) {
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
