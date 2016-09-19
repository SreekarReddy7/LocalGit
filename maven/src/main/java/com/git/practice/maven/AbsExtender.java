package com.git.practice.maven;

public class AbsExtender extends AbstractClass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	AbstractClass abs = new AbsExtender();
		abs.print();
		

	}*/

	public String AbsExtender(String string) {
		return string;
		
	}

	@Override
	public void print() {
		System.out.println("child");
	}
}

//}
