package com.cfs2160.lectures.week10;

import java.util.Scanner;

public class TempReader {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print ("Enter the temperature: ");
        String s = in.nextLine ();

        try {
            if (s.endsWith ("C")) {
                int temp = Integer.parseInt (s.substring (0, s.length () - 1));
                System.out.println ("temp = " + temp);
            } else {
                throw new NumberFormatException ();
            }
        }
        catch (NumberFormatException e) {
            System.out.println ("Wrong format");
        }


    }
}
