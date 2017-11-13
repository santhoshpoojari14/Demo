package com.demo.jaxws.beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str="1, 6cross,Bangalore";
		ArrayList aList= new ArrayList(Arrays.asList(str.split(",")));
		for(int i=0;i<aList.size();i++)
		{
		    System.out.println(" Splitted Address   "+aList.get(i));
		}
		
		System.out.println("aList *********************************" + aList);
	}
	
	


}
