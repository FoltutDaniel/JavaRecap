package com.zeke.exemples;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	/*
        int x,y;
        x = 10;
        System.out.println("X= "+x);
        y = ++x;
        
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        
        x = 10;
        
        y = x++;
        
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        */
    	
    	/*
    	int n, d, q;
    	
    	n = 10;
    	d = 0;
    	
    	if(d != 0 && (n % d) == 0) {
    		System.out.println(d + " is factor of" +n);
    	}
    	
    	if(d != 0 & (n % d) == 0) {
    		System.out.println(d + " is factor of" +n);
    	}
    	*/
    	/*
    	for(int i = 0; i<4; i++) {
    		one:{
    			two:{
    				three:{
    					System.out.println(i);
    					if(i == 1)
    						break one;
    					if(i == 2)
    						break two;
    				}
    				System.out.println(i);
    			}
    			System.out.println(i);
    		}
    	}
        */
    	System.out.println();
    	int spaces = 0;
    	char x;
    	do {
			x = (char)System.in.read();
			if(x == ' ') {
				spaces++;
			}
		} while (x != ',');
    	System.out.println("Number of spaces is "+spaces);
    	
    }
    
}
