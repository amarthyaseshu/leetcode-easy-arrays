package lce_easy_arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {

	public static void main(String[] args) {
		int[] nums = { 0,0 };
		System.out.println(specialArray(nums));

	}

	public static int specialArray(int[] nums) {
		 
		for (int x = 1; x <= nums.length; x++) {
			int countOfNumGrtrThanOrEqualToX = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= x) {
					countOfNumGrtrThanOrEqualToX++;
				}
			}
			if (x == countOfNumGrtrThanOrEqualToX) {
				return x;
			}
		}
		return -1;
	}

}
