package com.git.practice.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {

		Regex regex = new Regex();
		regex.tokenizeUsingScanner("ab;cd;ef;gh", ";");
		
	}
	private	static	void	tokenizeUsingScanner(String	string,String	regex)	{
	Scanner	scanner	=	new	Scanner(string);
	scanner.useDelimiter(regex);
	List<String>	matches	=	new	ArrayList<String>();
	while(scanner.hasNext()){
	matches.add(scanner.next());
	
	}
	System.out.println(matches);
	}
}
