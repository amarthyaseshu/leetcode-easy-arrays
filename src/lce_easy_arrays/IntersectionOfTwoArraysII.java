package lce_easy_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> resultList = new ArrayList<>();
		List<Integer> numsList = new ArrayList<>();
		if (nums1.length >= nums2.length) {
			for (int i = 0; i < nums1.length; i++) {
				numsList.add(nums1[i]);
			}
			for (int i = 0; i < nums2.length; i++) {
				if (numsList.contains(nums2[i])) {
					resultList.add(nums2[i]);
					numsList.remove(Integer.valueOf(nums2[i]));
				}
			}
		} else {
			for (int i = 0; i < nums2.length; i++) {
				numsList.add(nums2[i]);
			}
			for (int i = 0; i < nums1.length; i++) {
				if (numsList.contains(nums1[i])) {
					resultList.add(nums1[i]);
					numsList.remove(Integer.valueOf(nums1[i]));

				}
			}
		}
		int[] arr = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			arr[i] = resultList.get(i);
		}
		return arr;

	}

}
