package com.jspiders.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rgular3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".*abc.*");
		Matcher m=p.matcher("HIabcbye");
		boolean ans=m.matches();
		System.out.println(ans);


	}

}
