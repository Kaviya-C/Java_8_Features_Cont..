package com.java8.continuity;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerVsString_joinVsCollectors_joining {
	/*
	 * StringJoiner
	 * 
	 * StringJoiner is a class internally uses stringBuilder to join the string two
	 * form of stringJoiner-- with delimiter and with delimiter,prefix,suffix
	 * 
	 * 
	 * 
	 * String.join()-- internally uses stringJoiner class two ways String
	 * join(delimiter,elements) String join(delimiter,Iterable elements)
	 * 
	 * 
	 * Collectors.joining() used in stream() 3 ways Collectors.joining()
	 * COllectors.joining(delimiter) Collectors.joining(delimiter,prefix,suffix)
	 * 
	 * 
	 */
	public static void main(String... args) {
		StringJoiner s = new StringJoiner(" @ ", "[", "]");
		s.add("hello");
		s.add("hey");
		s.add("Kaviya");
		System.out.println(s);

		String[] array = new String[] { "Kaviya", "java", "Developer" };
		String result = String.join(" | ", array);

		String last = String.join(",", "may", "I", "Know", "Ur", "name");
		System.err.println(result);
		System.out.println(last);

		String d = Stream.of("java", "is", "My", "favourite", "Language", "from others").collect(Collectors.joining());
		System.out.println(d);

		String d1 = Stream.of("java", "is", "My", "favourite", "Language", "from others")
				.collect(Collectors.joining(" | "));
		System.out.println(d1);

		String d2 = Stream.of("java", "is", "My", "favourite", "Language", "from others")
				.collect(Collectors.joining(" ! ", "( ", " )"));
		System.out.println(d2);

	}

}
