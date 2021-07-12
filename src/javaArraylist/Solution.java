package javaArraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d,q,x,y;
        List<List<Integer>> ar = new ArrayList<>();

        for (int i=0;i<n;i++) {
            d = sc.nextInt();
            List<Integer> arr = new ArrayList<>();

            for (int j=0;j<d;j++) {
                arr.add(sc.nextInt());
            }

            ar.add(arr);
        }
        q = sc.nextInt();
        for(int i=0;i<q;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            try{
                System.out.println(ar.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
