package lce_easy_arrays;

import java.util.Arrays;

public class SortColours {

    public static void main(String[] args) {
        int[] colours={2,0,2,1,1,0};
        System.out.println(Arrays.toString( sortColoursBruteForce(colours)));
    }

    private static int[] sortColoursBruteForce(int[] colours) {
        for (int i = 0; i < colours.length-1; i++) {
            for (int j = i+1; j <colours.length ; j++) {
                if(colours[i]>colours[j]){
                    int temp=colours[j];
                    colours[j]=colours[i];
                    colours[i]=temp;
                }
            }
            
        }
        return colours;
    }
}
