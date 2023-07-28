package com.java8.continuity;

import java.util.NoSuchElementException;
import java.util.Optional;

class Person {
	// house declared as an Optional

	Optional<House> house;

	public Optional<House> getHouse() {
		return house;
	}

	public Optional<House> getHouseType() {
		return house;
	}

}

class House {
	// houseLoan declared as an Optional

	Optional<HouseLoan> houseLoan;

	public Optional<HouseLoan> getHouseLoan() {
		return houseLoan;
	}
}

class HouseLoan {
	String houseLoanDetails;

	public String getHouseLoanDetails() {
		return houseLoanDetails;
	}
}

public class OptionalConcept {
	public static void main(String... args) {
		// instantiation---> empty() of() ofNullable()
		Optional<String> a = Optional.empty();
		Optional<House> b = Optional.of(new House());
		House h = new House();
		Optional<House> c = Optional.ofNullable(h);
		if (c.isEmpty()) {
			System.out.println("Yes");
		} else
			System.out.println("No");

		// Extraction
		// get() -- value not there NOSuchElementException
		// orElse()
		// orElseGet()
		// orElseThrow()
		// ifPresent()
		// isPresent()

		Optional<Integer> d = Optional.of(100);
		System.out.println(d.get());

		d.orElse(90);
		Optional<House> e = Optional.of(new House());
		e.ifPresent((House house) -> house.getHouseLoan());
		System.out.println(e.isPresent());
		Optional<House> f = Optional.ofNullable(new House());
		f.orElseGet(() -> new House());
		f.orElseThrow(() -> new NoSuchElementException());
		System.out.println(f.isPresent());
		System.out.println(f.get());

		// mapping and filtering
		Optional<House> g = Optional.ofNullable(new House());
		g.map((House ho) -> ho.getHouseLoan());
		// flatMap()

		// g.flatMap((House s)->s.getHouseLoan()).map(HouseLoan::getHouseLoanDetails);

		/*
		 * java 8 provides efficient way to handle the absence of value
		 * 
		 * Optional is a class in Java.util.Optional
		 * 
		 * methods:
		 * 
		 * empty() of() ofNullable() isPresent() ifPresent()--supplier
		 * ifPresentOrElse---supplier isPresent() get() or()--supplier orElse()
		 * orElseGet()--supplier orElseThrow() map()--function flatMap()--function
		 * filter() --predicate
		 */
	}

}
