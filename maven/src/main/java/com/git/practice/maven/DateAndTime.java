package com.git.practice.maven;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date
		date
		=
		new
		Date();
		Date currentdate =  new Date();
		
		date.setTime(date.getTime()+24*60*60*1000);
		System.out.println(date);
		
		System.out.println((date.getTime() - currentdate.getTime())/(60*60*1000) );
	}

}
