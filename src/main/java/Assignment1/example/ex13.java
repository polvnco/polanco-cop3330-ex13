/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex13
{
    public static void main( String[] args )
    {
        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        System.out.print( "What is the principal amount? " );
        Scanner p1 = new Scanner(System.in);
        float principal = p1.nextFloat();

        System.out.print( "What is the rate? " );
        Scanner i1 = new Scanner(System.in);
        float interest = i1.nextFloat();

        System.out.print( "What is the number of years? " );
        Scanner t1 = new Scanner(System.in);
        int term = t1.nextInt();

        System.out.print( "What is the number of times the interest is compounded per year? " );
        Scanner c1 = new Scanner(System.in);
        int compound = c1.nextInt();

        float interestConversion = interest/100;

        double interestCompound = 1 + interestConversion / compound;
        double termCompound = compound * term;
        double amountAccrued = principal * (Math.pow(interestCompound, termCompound));

        System.out.println(principal + " invested at " + interest + "% for " + term + " years compounded " + compound + " times per year is " + dollarFormat.format(amountAccrued));
    }
}
