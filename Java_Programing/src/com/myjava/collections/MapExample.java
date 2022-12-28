package com.myjava.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		HashMap hmap=new HashMap();
		hmap.put("name", "vyshnavi");
		hmap.put("course", "selenium");
		System.out.println(hmap.isEmpty());
		System.out.println(hmap);
		//hmap.clear();
		//System.out.println(hmap);
		
		//System.out.println(hmap.get("name"));		
		
		HashMap hmap1=new HashMap();
		hmap1.put(10, "A");
		hmap1.put(20, "B");
		hmap1.put("name", "vyshnavi");
		hmap.putAll(hmap1);
		hmap1.put(20, "c");
		System.out.println(hmap);
		hmap.replace(10, "Sai");
		hmap.replace("name", "vyshnavi", "Testing");
		
		System.out.println(hmap);
		
		HashSet set=new HashSet();
		set.add(20);
		set.add(30);
		set.add("test");
		set.add(20);
		System.out.println(set);
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		HashSet<Integer> set1=new HashSet<Integer>();
		
	}

}
