package com.poppleton.crackers;

import java.text.NumberFormat;
import java.util.Locale;

public class PossiblyUsefulCode {

    public static void main (String[] args) {

        double foo = 200.0;
        double bar = 1.999;

        Locale locale = new Locale("en", "GB");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println (currencyFormatter.format (foo));
        System.out.println (currencyFormatter.format (bar));

    }

}
