package com.java8.continuity;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingHashMap {

	/*
	 * before java8 we can sort the hashmap
	 *  by using treemap 
	 *  or
	 *  treemap with supplied comparator
	 *  or
	 *  Collections.reverseOrder()
	 * 
	 */
	public static void main(String...args)
	{
	
	
	Map<String,Integer> map=new HashMap<>();
	map.put("Kaviya",83);
	map.put("geetha",73);
	
	map.put("raghu",80);
	
	map.put("Seema",98);
	
	map.put("Vipul",91);
	
	map.put("vinay",70);
	
	for(Entry<String,Integer> e:map.entrySet())
	{
		System.out.println(e.getKey()+" ---> "+e.getValue());
	}
	System.out.println();
	
	Map<String ,Integer> second=new TreeMap<>(map);
	for(Entry<String,Integer> entry:second.entrySet())
	{
		System.out.println(entry.getKey()+" ---> "+entry.getValue());
	}
	System.out.println();
	
	Map<String,Integer> third=new TreeMap<>(Collections.reverseOrder());
	third.putAll(map);
	for(Entry<String,Integer> entry:third.entrySet())
	{
		System.out.println(entry.getKey()+" ---> "+entry.getValue());
	}
	System.out.println("------------");

	Map<String, Integer> fourth = new TreeMap<String,Integer>(new Comparator<String>() 
    {
        @Override
        public int compare(String o1, String o2)
        {                                           
            return map.get(o1)-map.get(o2);
        }                                   
    });
	
	fourth.putAll(map);
	for(Map.Entry<String,Integer> entry:fourth.entrySet())
	{
		System.out.println(entry.getKey()+" ---> "+entry.getValue());
	}
	
	}
	
	
	
	/* after java8 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
