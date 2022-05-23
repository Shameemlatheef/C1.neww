package com.eva;

public class Q1 {
String h="happy";
String k="new year";
String l="I love";
String j="masai";





public static void main(String[] args) {
	Q1 g=new Q1();
//	System.out.println(g.h+g.k);
	StringBuilder h=new StringBuilder();
	 
	
	System.out.println(g.h+" "+h.append("new year"));
	System.out.println(g.l+" "+h.append("masai"));
	System.out.println(g.k+g.j);
}

}


//string concatination will not occure because string is immutable.by allowing the string builder we can make the string mutable;
//string builder helps to add strings and concatinate;