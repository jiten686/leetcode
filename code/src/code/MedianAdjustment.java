package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianAdjustment {

    public static long minMovesToMedian(int[] prices, int k) {      
    	 List<Integer> pricesList = new ArrayList<>(prices.length);
         for (int value : prices) {
        	 pricesList.add(value);
         }         
    	Collections.sort(pricesList);
    	
    	int n = pricesList.size();
    	
        int medianIndex = (n + 1) / 2;
        int median = pricesList.get(medianIndex - 1);

        int moves = 0;
        if (median < k) {
            // Adjust prices to increase median to k
            for (int i = medianIndex - 1; i < n && pricesList.get(i) < k; i++) {
                moves += k - pricesList.get(i);
            }
        } else if (median > k) {
            // Adjust prices to decrease median to k
            for (int i = medianIndex - 1; i >= 0 && pricesList.get(i) > k; i--) {
                moves += pricesList.get(i) - k;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] prices = {3,3,6,3,9};
        int k = 2;
    	
//        int n = 3;
//        int[] prices = {1,2,3};
//        int k = 5;
        long result = minMovesToMedian(prices, k);
        System.out.println(result);  // Output: 1
    }
}