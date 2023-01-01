package lce_easy_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbDisappearedInArr {

	public static void main(String[] args) {
		int[] nums = {  1,1 };
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> numsSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numsSet.add(nums[i]);
		}
		for (int j = 1; j <= nums.length; j++) {
			if (!numsSet.contains(j)) {
				result.add(j);
			}
		}

		return result;
	}

}
