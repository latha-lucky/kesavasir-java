package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[A,a]{1}.*");
		Matcher m=p.matcher("Apple");
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
