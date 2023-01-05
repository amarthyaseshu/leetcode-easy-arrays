package lce_easy_arrays;

public class MinDistToTheTargetEle {

	public static void main(String[] args) {
		int[] nums= {1,1,1,1,1,1,1,1,1,1};
	System.out.println(getMinDistance(nums,1,0));
	}
	
public static int getMinDistance(int[] nums, int target, int start) {
	
	int lastMinNum=Integer.MAX_VALUE;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==target) {
			if(i-start==0) {
				return Math.abs(i-start);
			}
			if(i-start<lastMinNum) {
				lastMinNum=Math.abs(i-start);
			}
		}
	}
	
	
	return Math.abs(lastMinNum);
        
    }

}
