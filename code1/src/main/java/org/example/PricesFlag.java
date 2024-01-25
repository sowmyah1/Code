package org.example;

import java.util.HashMap;
import java.util.Map;

public class PricesFlag {
    public static  int[] finalPrices(int[] prices) {
        int[] a = new int[prices.length];
        boolean flag =false;
        int j=0,i;
        System.out.println("asd");
        for( i=0;j<prices.length-1 ;i++){
            j=i+1;
            a[i]=prices[i];

                while (j < prices.length ) {
                    if (prices[i] >= prices[j]) {
                        a[i] = prices[i] - prices[j];
                        flag = true;
                        break;
                    }
                    j++;
                }
            if(!flag){
                a[i]=prices[i];

            }
        }
        a[prices.length-1]=prices[prices.length-1];
        return a;

    }

    public static void main(String[] args) {
//        int[] a  = finalPrices(new int[]{8,4,6,2,3});

//        for (int q:a){
//            System.out.println(q);
//        }
        int[] a = new int[]{10,20,30,40,50,10};
        int target = 5;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        while (i<a.length){
            map.put(a[i],i);
            i++;
        }
        System.out.println(map.get(20));
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println("Im key  "+m.getKey()+"   im value  "+m.getValue());
        }
    }
}
