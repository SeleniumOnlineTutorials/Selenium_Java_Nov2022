package com.myjava.strings;

public class MethodsInStringClass {
	
	public static void main(String[] args) {
		String s="Selenium WebDriver";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(12));
		System.out.println(s.length());
		System.out.println(s.replace('e', '*'));
		System.out.println(s.replace("WebDriver", "Testing"));
		System.out.println(s.indexOf("nium",3));
        System.out.println(s.lastIndexOf("e"));
        String sarray[]={"asjn","dadfa"};
        String st[]=s.split("t");
        for(int i=0;i<st.length;i++){
        	System.out.println(st[i]);
        }
        String s1=" Selenium WebDriver ";
        System.out.println(s.equalsIgnoreCase(s1));
        String s2=" Selenium";
        System.out.println(s2.contains(s));
        System.out.println(s.endsWith("v"));
        System.out.println(s.concat(s2));
        
        
        String substr=s.substring(5);
        System.out.println(substr);
        System.out.println(s.substring(5, 14));
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
        	System.out.println(ch[i]);
        }
        System.out.println("###############################################333");
        System.out.println(s1.length());
        System.out.println(s1);
        String s3=s1.trim();
        System.out.println(s3);
        System.out.println(s3.length());
	}

}
