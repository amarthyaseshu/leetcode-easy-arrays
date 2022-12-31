package lce_easy_arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		System.out.println(getRow(3));

	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> previousList = new ArrayList<>();
		previousList.add(1);
		if (rowIndex == 0) {
			return previousList;
		}
		List<Integer> presentList = new ArrayList<>();
		for (int i = 0; i <= rowIndex; i++) {
			presentList.add(0, 1);
			for (int j = 1; j < i; j++) {
				presentList.add(j, previousList.get(j - 1) + previousList.get(j));
			}
			presentList.add(i, 1);
			previousList = presentList;
			presentList = new ArrayList<>();
		}

		return previousList;

	}

}
