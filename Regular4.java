package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".*[abc,ABC].*");
		Matcher m=p.matcher("hibyeABC");
		boolean ans=m.matches();
		System.out.println(ans);


	}

}
