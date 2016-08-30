package com.git.practice.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Print details = new Print();
        details.setName("Deepak Ekkati");
        details.setMail("dekkati@uno.edu");
        details.setNumber(2462425);
        
        System.out.println(details);
    }
}
