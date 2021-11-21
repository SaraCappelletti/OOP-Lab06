package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	final List<Integer> array = new ArrayList<Integer>();
    	for (int i = 1000; i < 2000; i++) {
    		array.add(i);
    	}
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	final List<Integer> list = new LinkedList<Integer>();
    	list.addAll(array);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	int temp = array.get(0);
    	array.set(0, array.get(array.size() - 1));
    	array.set(array.size() - 1, temp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for (final var elem: array) {
    		System.out.println(elem);
    	}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time = System.nanoTime();
    	for (int i = 0; i < 100000; i++) {
    		array.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Adding 100000 elements to the ArrayList took " + time + "ns");
        
    	time = System.nanoTime();
    	for(int i = 0; i < 100000; i++) {
    		list.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Adding 100000 elements to the LinkedList took " + time + "ns");
    	
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	time = System.nanoTime();
    	final var middle = array.size() / 2;
    	for (int i = 0; i < 1000; i++) {
    		array.get(middle);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Reading 1000 elements from the ArrayList took " + time + "ns");
    	
    	time = System.nanoTime();
    	for (int i = 0; i < 1000; i++) {
    		list.get(middle);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("Reading 1000 elements from the LinkedList took " + time + "ns");
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
    	var map = new TreeMap<String, Long>();
    	map.put("Africa", 1110635000L);
    	map.put("Americas", 972005000L);
    	map.put("Antarctica", 0L);
    	map.put("Asia", 4298723000L);
    	map.put("Europe", 742425000L);
    	map.put("Oceania", 38304000L);
        /*
         * 8) Compute the population of the world
         */
    	long worldPopulation = 0L;
    	for (final long continentPopulation : map.values()) {
    		worldPopulation += continentPopulation;
    	}
    	System.out.println("Population of the world" + worldPopulation);
    }
}
