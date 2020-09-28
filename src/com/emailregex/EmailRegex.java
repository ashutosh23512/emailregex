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
		Pattern pattern=Pattern.compile("^[a-z A-Z]+@{1}[a-z A-Z]+");		
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


