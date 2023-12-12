package org.example;

public class Stockselling {
    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max=0,i=0;
        while(i<prices.length){
            if(prices[i]<min){
                min=prices[i];
            }
            else if((prices[i]-min)>max){
                max = prices[i]-min;
            }
            i++;
        }
        return max;

//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        int i=0,j=0,profit=0,maxProfit=0;
//        while(i<prices.length){
//            if(prices[i]<max){
//                max=prices[i];
//                maxProfit=prices[i+1];
//                j=i+1;
//            }
//            i++;
//        }
//        System.out.println(max);
//
//        while(j<prices.length){
//            if(prices[j]>min){
//                maxProfit=prices[j];
//            }
//            j++;
//        }
//        System.out.println(maxProfit);
//        return maxProfit-max;


    }
    public static void main(String[] args) {
        int a = maxProfit(new int[]{2,1,4,5});
        System.out.println(a);
    }
}
