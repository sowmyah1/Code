package org.example;

import java.util.Arrays;

public class FindMaxSum {
//    public static void findSum(){
//        int max = Integer.MIN_VALUE;
//        int sum=0,index1=0,index2=0;
//        int[] a = new int[]{2,-4,-3,4,-5};
//        for(int i=0;i<a.length ;i++){
//           if(a[i]>max){
//               max = a[i];
//               index1= i;
////               index2=0;
//           }
//            sum+=a[i];
//            if(sum>max){
//                max=sum;
//               index2 =i;
//            }
//            else{
//                sum=a[i];
//
//            }
//        }
//        System.out.println(max+"  index first "+ (index1 +1)+" index second "+(index2+1));
//    }

//    }
public static void swap(int[] nums1, int[] nums2,int i,int j){
    System.out.println("inside swap loop");
    int temp = nums1[i];
    nums1[i]= nums2[j];
    nums2[j]= temp;
}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=m-1,j=n-1;i>=0 && j>=0;){
           if(nums1[i]==0){
               swap(nums1,nums2,i,j);
               i--;
               j--;
           }
           else{
               break;
           }
       }
        Arrays.sort(nums1);
       for(int i: nums1){
           System.out.println(i);
       }
    }
    public static void main(String[] args) {
    int[] a = {1,2,3,0,0,0};
    int[] b = {2,4,5};
        merge(a,6,b,3);
    }

}
