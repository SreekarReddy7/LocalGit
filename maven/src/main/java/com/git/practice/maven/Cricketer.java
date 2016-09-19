package com.git.practice.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cricketer implements Comparable<Cricketer> {

int runs;

String name;

public Cricketer(String name, int runs) {

super();

this.name = name;

this.runs = runs;

}

@Override

public String toString() {

return name + " " + runs;

}

public int compareTo(Cricketer that) {

if (this.runs > that.runs) {

return 1;

}

if (this.runs < that.runs) {

return -1;

}

return 0;

}

public static void main(String arrgs[]){
	
	List<Cricketer> cricketers = new ArrayList<Cricketer>();

	cricketers.add(new Cricketer("Bradman", 9996));

	cricketers.add(new Cricketer("Sachin", 14000));

	cricketers.add(new Cricketer("Dravid", 12000));

	cricketers.add(new Cricketer("Ponting", 11000));

	System.out.println(cricketers);
	
	Collections.sort(cricketers);

	System.out.println(cricketers);
}

}
