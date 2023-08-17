package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular6 {

	public static void main(String[] args) {
		String email="rolex_1234@hackerrank.com";
		Pattern p=Pattern.compile("[a-z]{4,6}_*[0-9]{4,6}@hackerrank[.]com");
		Matcher m=p.matcher("email");
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
