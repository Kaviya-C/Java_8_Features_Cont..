package com.java8.continuity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Spliterator8 {
	public static void main(String... args) {
		// spliterator-- java 8

		// java.util

		// split then iterating

		// one by one -- tryAdvance()

		// bulk -- forEachRemaining()

		// exact size

		// extract some characteristics like ORDERED DISTINCT IMMUTABLE
		// CONCURRENT NONNULL SIZED SORTED SUBSIZED

		/*
		 * methods: tryAdvance() forEachRemaining() trySplit() estimateSize()
		 * getExactSizeIfKnown() characteristics() hasCharacteristics() getComparator()
		 * 
		 */

		// applicable for array

		String[] array = new String[] { "Java", "JDBC", "Spring", "Servlet" };
		Spliterator<String> sp = Arrays.spliterator(array);

		// applicable for collection
		List<String> list = Arrays.asList("apple", "mango", "Orange", "banana");
		Spliterator<String> sp1 = list.spliterator();

		// applicable for stream
		Stream<String> stream = Stream.of("One", "Two", "Three", "FOur");
		Spliterator<String> sp2 = stream.spliterator();

//		for(String a:list)
//		{
//		sp1.tryAdvance(System.out::println);
//		}

		sp1.forEachRemaining((e) -> System.out.print(e + " "));

		// trySplit()
		List<String> l = new ArrayList<>(Arrays.asList("queen", "King", "Minister", "President"));
		System.out.println(l);
		Spliterator<String> first = l.spliterator();

		Spliterator<String> second = first.trySplit();

		System.out.println("First split");
		first.forEachRemaining((word) -> System.out.println(word));

		System.out.println("Second split");
		second.forEachRemaining(System.out::println);

		List<Integer> number = new ArrayList<>(Arrays.asList(5, 6, 2, 5, 9, 0));

		Spliterator<Integer> num = number.spliterator();
		Spliterator<Integer> num1 = num.trySplit();
		System.out.println(num1.estimateSize());

		List<Integer> fake = new ArrayList<>();
		Spliterator<Integer> spr = fake.spliterator();
		spr.tryAdvance(System.out::println);
		System.out.println(num1.getExactSizeIfKnown());

		// estimateSize()=== parallel processing parallel stream
		// getExactSizeIfKnown == collections size() if size not known return -1

		System.out.println(spr.characteristics());
		System.out.println(spr.hasCharacteristics(16464));

		TreeSet<Integer> tree = new TreeSet<>(number);
		System.out.println(tree);

		System.out.println(tree.comparator());

		System.out.println();

	}

}
