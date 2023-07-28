package com.java8.continuity;
/*
 * Intermediate operations return another stream as a result
 * Terminal operations return non-stream value as a result
 * 
 * intermediate operations- filter() ,map(),distinct(),sorted(),limit() ,skip()
 * Terminal operations -- forEach() reduce()  min() max() findFirst() findAny() 
 * collect() noneMatch() allMatch() anyMatch()
 * 
 * intermediate does not give end result
 * it give one stream into another stream
 * 
 * terminal gives end result
 * 
 * intermediate lazily loaded
 * until terminal operations called on the stream 
 * intermediate operations are not executed it just stored in the memory 
 * 
 */
public class IntermediateVsTerminal {

}
