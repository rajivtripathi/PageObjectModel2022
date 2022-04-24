package com.Extentreports;

import java.util.Date;

import com.google.i18n.phonenumbers.AsYouTypeFormatter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date date = new Date();
		
		String name=date.toString();
		
		System.out.println("----"+name);
		String name1=name.replace(" ", "_");
		System.out.println("----"+name1);
		String name2=name1.replace(":", "_");
		System.out.println("------"+name2);
	}

}
