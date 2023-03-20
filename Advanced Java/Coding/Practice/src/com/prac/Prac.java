package com.prac;

import java.util.Arrays;
import java.util.Scanner;


public class Prac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int spaces=0,characters=0;
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
				spaces++;
			else if((c[i]>='a' && c[i]<='z') && !Character.isDigit(c[i]))
				characters++;
		}
		System.out.println("No of spaces : "+spaces+" and characters : "+characters);
	}
}
