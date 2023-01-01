package lce_easy_arrays;

public class EleAppearingMoreThan25PercentInSortedArr {

	public static void main(String[] args) {
		int[] arr = { 1};
		System.out.println(findSpecialInteger(arr));
	}

	public static int findSpecialInteger(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int percentNum = (int) Math.ceil((0.25) * arr.length);
		int value = arr[0];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
				if (count > percentNum) {
					return arr[i];
				}
			} else {
				value = arr[i];
				count = 1;
			}
		}
		return 0;

	}

}
