package lce_easy_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SlowestKey {

	public static void main(String[] args) {
		int[] releaseTimes = {19,22,28,29,66,81,93,97};
		System.out.println(slowestKey(releaseTimes, "fnfaaxha"));
	}

	public static char slowestKey(int[] releaseTimes, String keysPressed) {
		int[] keyPressTimes=new int[releaseTimes.length];
		keyPressTimes[0]=releaseTimes[0];
		for(int i=1;i<releaseTimes.length;i++) {
			keyPressTimes[i]=releaseTimes[i]-releaseTimes[i-1];
		}
		char highest = 0;
		int highestTime = 0;
		for (int i=0;i<keyPressTimes.length;i++) {
			if (keyPressTimes[i] > highestTime) {
				highestTime = keyPressTimes[i];
				highest = keysPressed.charAt(i);
			} else if (keyPressTimes[i] == highestTime && keysPressed.charAt(i) > highest) {
				highest = keysPressed.charAt(i);
			}
		}
		return highest;
	}

}
