package org.example;

public class string {
//    public static void stirngProblem(){
//        String s = "sowmya";
//        String str ="";
//        for(int k=0,k<s.length();k++){
//            for (int i = k, j = 1; i < s.length(); i++, j++) {
//
//                str += s.substring(i, j);
//                System.out.println(str);
////            break;
//            }
//        }
//    }}

    static void num() {
        int[] a = {1, 0, 0, 2, 2, 0, 0, 1};
        int temp,c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] >= a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            System.out.println(a[i]+" "+c++);
            }
//        for (int j = 0; j < a.length; j++) {
//            System.out.println(a[j]);
//        }

    }

    public static void main(String[] args) {
        num();
    }
}

