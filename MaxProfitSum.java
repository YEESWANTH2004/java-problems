package Biweekly1;

public class MaxProfitSum {

    public static int profit(int[] prices) {

        if(prices == null || prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};
        int[] arr3 = {3,8,2,5,1,7};

        System.out.println("Profit 1: " + profit(arr1));
        System.out.println("Profit 2: " + profit(arr2));
        System.out.println("Profit 3: " + profit(arr3));
    }
}