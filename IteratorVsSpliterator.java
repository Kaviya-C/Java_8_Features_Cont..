package com.java8.continuity;

public class IteratorVsSpliterator 
{
	/*
	 * iterator comes from 1.2 v
	 * spliterator comes from 1.8v
	 * 
	 * iterator used for collection types
	 * spliterator used for collection stream arrays
	 * 
	 * iterator serial processing
	 * spliterator parallel processing
	 * 
	 * indivual iteration -- hasNext()  next()
	 * bulk iteration not possible in iterator
	 * 
	 * spliterator one by one -- tryAdvance()
	 * 			   bulk-- forEachRemaining
	 * 
	 * note: java8 forEachRemaining comes in iterator also
	 * 
	 * iterator size unknown
	 * spliterator -- getExactSizeIfKnown()    parallel processing--estimateSize()
	 * 
	 * we can extract the properties like sorted ordered distinct sized through characteristics()
	 * 
	 * iterator externally iterate
	 * spliterator internally iterate
	 * 
	 */

}
