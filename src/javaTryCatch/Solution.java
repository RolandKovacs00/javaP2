package javaTryCatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int x,y,a=0;
        try{
            Scanner sc = new Scanner(System.in);
             x = sc.nextInt();
             y = sc.nextInt();
            a=x/y;
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
