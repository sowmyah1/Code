package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.ArrayList;
public class sumOfArray {
    static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        int sum = 0;
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        int i=0,j=0;
        for (; j < n && i<n;) {
            if (sum == s) {
                list.add(i+1);
                list.add(j);
                break;
            }  if (sum < s) {
                sum = sum + arr[j];
                j++;
            }  if (sum > s ) {
                sum = sum - arr[i];
                i++;
//                System.out.print(sum+" ");
            }
        }
        if(sum==s&&list.size()==0){

        }

        return list;
//        System.out.println(map);
//        return map;
    }

    public static void main(String[] args) {
        int[] arr = {135 ,101 ,170 ,125 ,79 ,159, 163, 65 ,106 ,146 ,82 ,28 ,162, 92 ,196 ,143, 28 ,37 ,192, 5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96, 48, 127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12 ,123 ,134};
        int n = arr.length;
        int s = 468;
        System.out.println(n);
        ArrayList<Integer> a = subArraySum(arr,n,s);
//        HashMap<Integer, Integer> a = subArraySum(arr, n, s);
//        for (Map.Entry<Integer, Integer> entry : a.entrySet())
//        for(int i : a)
//        {
//            System.out.println(" key is  " + entry.getKey());
//            System.out.println(i);
//        }
    }
}

//public class sumOfArray{
//
//    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
//        ArrayList<Integer> result = new ArrayList<>();
//        int left = 0, right = 0, sum = 0;
//
//        while (right <= n) {
//            if (sum < s) {
//                sum += arr[right];
//                right++;
//            } else if (sum > s) {
//                sum -= arr[left];
//                left++;
//            }
//
//            if (sum == s) {
//                result.add(left + 1); // Adjusting for 1-based indexing
//                result.add(right);
//                return result;
//            }
//        }
//
//        result.add(-1); // If no subarray found
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 3, 7, 3,12};
//        int n1 = arr1.length;
//        int s1 = 12;
//
//        ArrayList<Integer> result1 = subarraySum(arr1, n1, s1);
//        if (result1.get(0) != -1) {
//            System.out.println("Output 1: " + result1.get(0) + " " + result1.get(1));
//        } else {
//            System.out.println("No subarray with the given sum.");
//        }
//
//    }
//}


//public class sumOfArray {
//    static HashMap subArraySum(int[] arr, int n, int s)
//    {
//        int sum=0;
//        boolean flag=false;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        // Your code here
//        for(int i=0,j=0;j<n;){
//            if(sum==s){
//                map.put(i+1,arr[i]);
//                map.put(j+1,arr[j]);
//                flag=true;
//                break;
//            }
//            else if(sum<s){
//                sum=sum+arr[j];
//                j++;
//            }
//            else if(sum>s){
//                sum = sum-arr[i];
//                i++;
//            }
//
//            else if(flag==false){
//                map.put(-1,0);
//            }
//        }
//        return map;
//    }


//        static HashMap<Integer, Integer> subArraySum(int[] arr, int n, int s) {
//            int sum = 0;
//            int start = 0;
//            HashMap<Integer, Integer> map = new HashMap<>();
//
//            for (int i = 0; i < n; i++) {
//                sum += arr[i];
//
//                while (sum > s) {
//                    sum -= arr[start];
//                    start++;
//                }
//
//                // Check if the current sub array sum matches the target sum s
//                if (sum == s) {
//                    // Store the elements in the subarray in the HashMap
//                    for (int j = start; j <= i; j++) {
//                        map.put(j + 1, arr[j]);
//                    }
//                    return map;
//                }
//            }
//            System.out.println("No subarray found with the given sum.");
//            return map;

//        int sum=0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        // Your code here
//        for(int i=0,j=1;i<n;i++){
//            if(sum==s){
//                break;
//            }
//            if(sum<=s && arr[i]<=s){
//                sum=sum+arr[i];
//                map.put(i+1,arr[i]);
//            }
//            else{
//                sum=0;
//                i++;
//            }
//        }
//        System.out.println(sum);
//        return map;

//    public static void main(String[] args) {
//        int[] arr = {1,4,5,6};
//        int n = 6, s = 9;
//        HashMap<Integer,Integer> a = subArraySum(arr, n, s);
//        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
//            System.out.println(" key is  "+entry.getKey());
//        }
//    }
//}

