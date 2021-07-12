package javaMap;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> tel = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int telnr=in.nextInt();
            tel.put(name, telnr);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String p = in.nextLine();
            if(tel.containsKey(p))
                System.out.println(p + "=" + tel.get(p));
            else
                System.out.println("Not found");
        }
    }
}
