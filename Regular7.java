package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-z,A-Z]{5,6}[0-9]{4,5}");
		Matcher m=p.matcher("abcdf12124");
		boolean ans=m.matches();
		System.out.println(ans);
		System.out.println("========");
		boolean ans2=Pattern.matches("[a-z,A-Z]{5,6}[0-9]{4,5}","abcdf12124");
		System.out.println(ans);

	}

}
