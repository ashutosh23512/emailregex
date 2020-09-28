package com.emailregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailRegex {

	public static void main(String[] args) {
		for(;;) {
		System.out.println("Enter Email Address");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		Pattern pattern=Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");		
		Matcher matcher=pattern.matcher(email);
		
		boolean matchFound=matcher.find();
		if(matchFound)
		{
			System.out.println("Matched");
		}
		else
		System.out.println("Not Matched");
		}
	}

	}


