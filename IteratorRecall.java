package com.java8.continuity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorRecall {
	public static void main(String... args) {
		
		
		
		
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(9);list.add(89);list.add(75);
		
		System.out.println(list);
		
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		
		
		ListIterator<Integer> lit=list.listIterator(list.size());
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+" ");
		}
	}

}
