package lce_easy_arrays;

import java.util.ArrayList;
import java.util.List;

public class RemovingAnagrams {

	public static void main(String[] args) {
		String[] words = {"abba","baba","bbaa","cd","cd"};
		System.out.println(removeAnagrams(words));
	}

	public static List<String> removeAnagrams(String[] words) {
		List<String> resultList = new ArrayList<>();
		List<String> resultListOriginal = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			resultList.add(sortString(words[i]));
			resultListOriginal.add(words[i]);
		}

		for (int i = 0; i < resultList.size() - 1; i++) {
			if (isAnagram(resultList.get(i), resultList.get(i + 1))) {
				resultList.remove(i + 1);
				resultListOriginal.remove(i + 1);
				i = i - 1;
			}
		}

		return resultListOriginal;

	}

	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}

	private static String sortString(String str) {
		char[] strArr = str.toCharArray();
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (strArr[i] > strArr[j]) {
					char temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}

		return String.valueOf(strArr);
	}

}
