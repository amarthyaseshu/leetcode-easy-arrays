package lce_easy_arrays;

import java.util.Arrays;

public class DefuseTheBomb {

	public static void main(String[] args) {
		int[] code = { 2,4,9,3 };
		System.out.println(Arrays.toString(decrypt(code, -2)));

	}

	public static int[] decrypt(int[] code, int k) {
		 int[] decryptedArr=new int[code.length];
		 if(k==0) {
			 for(int i=0;i<code.length;i++) {
				 decryptedArr[i]=0;
			 }  
		 }else if(k>0) {
		 for(int i=0;i<code.length;i++) {
			 decryptedArr[i]=getForwardSumValue(code,k,i);
		 }
		 }else {
			 for(int i=0;i<code.length;i++) {
				 decryptedArr[i]=getReverseSumValue(code,k,i);
			 }
			 }
		return decryptedArr;
	        
	    }

	private static int getReverseSumValue(int[] code, int k, int i) {
		int sumValue = 0;
		int index = 0;
		for (int j = 1; j <= -k; j++) {
			if ((i - j) <0) {
				index = (i - j) + code.length;
			} else {
				index = i - j;
			}
			sumValue += code[index];
		}
		return sumValue;
	}

	private static int getForwardSumValue(int[] code, int k, int i) {
		int sumValue = 0;
		int index = 0;
		for (int j = 1; j <= k; j++) {
			if ((i + j) > code.length - 1) {
				index = (i + j) - code.length;
			} else {
				index = i + j;
			}
			sumValue += code[index];
		}
		return sumValue;
	}

}
