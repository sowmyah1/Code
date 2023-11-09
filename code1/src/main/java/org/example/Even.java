package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Even {


    public static void main(String[] args) {
        int arr[]={1 ,5 ,3 ,4, 3 ,5 ,6};
        int n=7;
        int index=10000000;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(index>map.get(arr[i])){
                    index=map.get(arr[i]);
                    System.out.println(index);
                }
            }
            else{
                map.put(arr[i],i);
            }
        }

        if(index!=1000000)
            System.out.println(index+1);
        else
            System.out.println(-1);
        }
    }
