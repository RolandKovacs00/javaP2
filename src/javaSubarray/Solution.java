package javaSubarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int nr = 0;
        int s = 0;
        for (int i=0;i<arr.length;i++) {
            for (int j=i;j<arr.length;j++) {
                s = s+arr[j];
                if (s<0) {
                    nr++;
                }
            }
            s = 0;
        }
        System.out.println(nr);
    }
}
