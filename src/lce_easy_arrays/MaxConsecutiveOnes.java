package lce_easy_arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = { 1,0,1,1,0,1 };
		System.out.println(findMaxConsecutiveOnes(nums));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int highestConsecutiveOnes = 0;
		int highestConsecutiveOnesOld = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				highestConsecutiveOnes++;
			} else {
				if (highestConsecutiveOnes > highestConsecutiveOnesOld) {
					highestConsecutiveOnesOld = highestConsecutiveOnes;	
				}
				highestConsecutiveOnes = 0;
			}
		}
		return (highestConsecutiveOnes > highestConsecutiveOnesOld) ? highestConsecutiveOnes
				: highestConsecutiveOnesOld;
	}

}
