package org.basic.java;

import java.util.Scanner;

public class CurrencyCheck
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the amount");
        int amt =scn.nextInt();
        scn.close();
        if(amt>=2000)
        {
        	System.out.println("2000x "+(amt/2000));
        	amt=amt%2000;
        }
        if(amt>=500)
        {
        	System.out.println("500x "+(amt/500));
        	amt=amt%500;
        }
        if(amt>=200)
        {
        	System.out.println("200x "+(amt/200));
        	amt=amt%200;
        }
        if(amt>=100)
        {
        	System.out.println("100x "+(amt/100));
        	amt=amt%100;
        }
        if(amt>=50)
        {
        	System.out.println("50x "+(amt/50));
        	amt=amt%50;
        }
	}

}
