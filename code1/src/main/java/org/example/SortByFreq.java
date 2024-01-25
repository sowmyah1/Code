package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByFreq {
    static void sortByFreq(int a[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int freq=0,j=1;
        Arrays.sort(a);
        for(int i=0;i<n&&j<n;){
        if(a[i]==a[j]){
            freq++;
            j++;
        }
        else{
            map.put(a[i],freq);
            freq=0;
            i++;
        }
    }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getValue()+"  "+entry.getValue());
        }

    }
    public static void main(String[] args) {
        sortByFreq(new int[]{2,2,3,4,5,5,5,5},8);
    }
}
