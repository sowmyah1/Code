package org.example;

public class dutchflag {
    public static void dutchNationalFlag(int[] a){
        int i=0,j=0,k=a.length-1;
        int temp=0;
        System.out.println("qwed");
        for(i=0;i<a.length;i++){
            j=i;
        while(j<k && j<a.length){
            System.out.println(a[j]+"im for  loop");
            if(a[j]>a[k]){
                temp=a[k];
                a[k]=a[j];
                a[j]=temp;
                j++;
                k--;
                System.out.println(a[j]);
            }
            else {
                k--;
            }
        }}
        for(int m=0;m<a.length;m++){
            System.out.println(a[m]+ " im m");
        }
    }
    public static void main(String[] args) {
        int[] a = {0,2,1,0,1};
         dutchNationalFlag(a);
    }
}
