package lce_easy_arrays;

public class CheckIfAll1sAreAtLeastKPlacesAway {

	public static void main(String[] args) {
		int[] nums= {1,0,0,0,1,0,0,1};
		System.out.println(kLengthApart( nums, 2));
	}
	
	public static boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]==1) {
        		int difference=0;
        		for(int j=i+1;j<nums.length;j++) {
                	if(nums[j]==1 && difference<k) {
                		return false;
                	}else if(nums[j]==1) {
                		i=j-1;
                		break;
                	}
                	difference++;
                }
        	}
        	
        }
        return true;		
    }

}
