package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("A.*");
		Matcher m=p.matcher("Apple");
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
