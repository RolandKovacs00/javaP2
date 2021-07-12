package javaList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i=0;i<N;i++) {
            l.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for (int i=0;i<Q;i++) {
            String tq = sc.next();
            if (tq.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                l.add(index, value);
            } else { // "Delete"
                int index = sc.nextInt();
                l.remove(index);
            }
        }
        for (int i=0;i<l.size();i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
