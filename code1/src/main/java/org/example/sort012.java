package org.example;

public class sort012 {
    public static void sort012(int a[], int n)
    {
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<=a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
                    System.out.println(a[i]+ "added  to "+i);
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        int[] a = {1,1,2,1,2,0};
        int n=6;
        sort012(a,n);
    }
}
