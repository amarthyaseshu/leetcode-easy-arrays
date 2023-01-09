package lce_easy_arrays;

public class TeemoAttacking {

	public static void main(String[] args) {
		int[] timeSeries= {1,2};
System.out.println(findPoisonedDuration( timeSeries, 2));
	}
	
	 public static int findPoisonedDuration(int[] timeSeries, int duration) {
	        int count=0;
	        for(int i=0;i<timeSeries.length;i++) {
	        	int tempDuration=duration;
	        	int initialVal=timeSeries[i];
	        	int nextVal=Integer.MAX_VALUE;
	        	if(i<timeSeries.length-1) {
	        	 nextVal=timeSeries[i+1];
	        	}
	        	while(tempDuration>0 && initialVal<nextVal) {
	        		initialVal++;
	        		count++;
	        		tempDuration--;
	        	}
	        }
	        return count;
	    }

}
