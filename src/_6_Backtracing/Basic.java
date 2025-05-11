package _6_Backtracing;

import java.util.Arrays;

public class Basic {

    public void printName(String s, int n) {
        recurseName(s, n, 0);
    }
     void recurseName(String s, int n , int start ) {
        if(start < n) {
            System.out.println(s);
            recurseName(s, n, start+1);
        }
     }

     public int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n -1);
     }

     public void  fibonacci(int n) {
        int n1 = 1, n2 =1;

        if(n <= 1) {
            System.out.println(1);
        }else if (n ==2) {
            System.out.print(n1 + "-> " + n2);
        } else {
            System.out.print(n1 + "-> " + n2);
            int sum = 0;
            for(int i = 2 ; i < n-2 ; i++) {
               sum = n1+n2;
               n1 = n2;
               n2 = sum;
               System.out.print("-> " + sum);
            }
        }
        System.out.println();
     }

     public int fibonacciRec(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRec(n-1) + fibonacciRec(n-2);
     }

     public void fun(int i, int[] arr, int n) {
        if(i > n/2) {
            Arrays.stream(arr).forEach(x -> System.out.println(x));
            return;
        }

        swap(i, n-i-1, arr);
        fun(i+1, arr, n);
     }

     private void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }

     public boolean palindrome(String s, int i, int n) {
        if(i > n/2) {
            return true;
        }
        if(s.charAt(i) != s.charAt(n - i -1)) {
           return false;
        }
        return palindrome(s, i+1, n);
     }
}
