package UtilsClass;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String args[]) {
        // create a currency object with specified locale
        Locale locale = Locale.GERMANY;
        Currency curr = Currency.getInstance(locale);

        // print currency's code
        System.out.println("Locale's currency code:" + curr.getCurrencyCode());
        
        // get and print the symbol of the currency
        String symbol = curr.getSymbol();
        System.out.println("Currency symbol is = " + symbol);
        NumberFormat format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY);
        //format.setCurrency(curr);
        System.out.println(format.format(53.00));
    }
}
