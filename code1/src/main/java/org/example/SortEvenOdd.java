package org.example;

public class SortEvenOdd {
    public  static void sortEvenOdd(int[] a){
        int temp;
        for(int i=0,j=a.length-1;i!=j;){
            if(a[i] % 2 ==0){
                i++;
            }
            else if(a[j]%2 ==0){
                temp=a[j];
                a[j]=a[i];
                a[i]= temp;
                j--;
            }
            else{
                j--;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
       sortEvenOdd(new int[]{1,7,10,23,22,3,4,5});
    }
}
