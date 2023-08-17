package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular5 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[6,7,8,9]{1}[0-9}{9}");
		Matcher m=p.matcher("7384567837");
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
