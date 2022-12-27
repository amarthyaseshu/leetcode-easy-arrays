package lce_easy_arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {

	public static void main(String[] args) {
		int[] cost = { 1,2,3};
		System.out.println(minimumCost(cost));
	}

	public static int minimumCost(int[] cost) {
		if(cost.length==2) {
			return cost[0]+cost[1];
		}
		sortArr(cost);
		int payableAmt=0;
		int skipCounter=1;
		for(int i=cost.length-1;i>=0;i--) {
			if(skipCounter%3!=0) {
			payableAmt+=cost[i];
			}
			skipCounter++;
		}
		return payableAmt;
	}

	private static void sortArr(int[] cost) {
		for (int i = 0; i < cost.length - 1; i++) {
			for (int j = i + 1; j < cost.length; j++) {
				if (cost[i] > cost[j]) {
					cost[i] = cost[i] + cost[j];
					cost[j] = cost[i] - cost[j];
					cost[i] = cost[i] - cost[j];
				}
			}
		}

	}

}
