package com.myjava.collections;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Collections");
		al.add(23.45);
		al.add('e');
		
		//System.out.println(al);
		al.add(10);
		al.add("Collections");
		al.add(23.45);
		al.add('e');
		System.out.println(al);
		
		for(int i=0;i<al.size();i++){
		//	System.out.println(al.get(i));
		}
		/*System.out.println("Colloction Size: "+al.size());
		al.remove(7);
		al.remove("Collections");
		System.out.println("Colloction Size after deleting the elements: "+al.size());*/
		
		al.add(4, "value changed");
		
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add(1);
		al1.add(2);
		
		Object[] x=al1.toArray();
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		al.addAll(2,al1);
		System.out.println(al);
		
		al.set(2, "vlaue replaced");
		System.out.println(al);
		
		/*al.clear();
		System.out.println(al);
*/		
		System.out.println(al.contains(1));
		System.out.println(al.containsAll(al1));
		System.out.println(al.indexOf(23.45));
		System.out.println(al.lastIndexOf(23.45));
		System.out.println("-------------------------------------------------------------------------");
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(23);
		li.add(46);
		/*for(int a:li){
			System.out.println(a);
		}*/
		
		Iterator it=li.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		
		
		
		
		ArrayList<Double> l=new ArrayList<Double>();
		
		
		
	}

}
