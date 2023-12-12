package org.example;

public class dutchflag {
    public static void dutchNationalFlag(int[] a){
        int i=0,j=0,k=a.length-1;
        int temp;
        while(j<=k){
            if(a[j]==0){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++; j++;
            }
            else if (a[j]==1){
                j++;
            }
            else if (a[j]==2){
                temp=a[k];
                a[k]=a[j];
                a[j]=temp;
                k--;
            }
        }

        for(int m=0;m<a.length;m++){
            System.out.print(a[m]);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,1,1,0,0,0,2,2,1,0,0,1,2,0,1,0};
         dutchNationalFlag(a);
    }
}
