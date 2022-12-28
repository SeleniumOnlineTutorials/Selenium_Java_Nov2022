package com.myjava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		map.put("e", 50);
		map.put("f", 60);
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.print(key+ " ");
			System.out.println(map.get(key));
		}
		
		
		
	}

}
