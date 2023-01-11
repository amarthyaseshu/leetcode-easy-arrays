package lce_easy_arrays;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4 };

		System.out.println(findKthPositive(arr, 2));

	}

	public static int findKthPositive(int[] arr, int k) {
		for (int i : arr) {
			if (i <= k) {
				k++;
			} else {
				break;
			}

		}
		return k;
	}

//	public static int findKthPositive(int[] arr, int k) {
//		List<Integer> missingNums = new ArrayList<>();
//		int lastNum = arr[arr.length - 1];
//		int j = 0;
//		for (int i = 0; i < lastNum && j < arr.length; i++) {
//			if (arr[j] == i + 1) {
//				j++;
//			} else {
//				if (missingNums.size() == k - 1) {
//					return i + 1;
//				}
//				missingNums.add(i + 1);
//			}
//		}
//
//		if (missingNums.size() == 0) {
//			return lastNum + k;
//		} else {
//			return lastNum + (k - missingNums.size());
//		}
//	}

}
