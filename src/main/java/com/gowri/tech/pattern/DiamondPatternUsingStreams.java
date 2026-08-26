package com.gowri.tech.pattern;
import java.util.stream.IntStream;

/**
 * Prints a diamond pattern using Java Streams.
 */

public class DiamondPatternUsingStreams {

	    /**
	     * Prints the diamond pattern.
	     *
	     * @param n number of rows in the upper half
	     */
	    public static void printDiamond(int n) {

	        // Upper half: 1, 3, 5, 7, 9 stars
	        IntStream.rangeClosed(1, n)
	                .forEach(row -> printRow(n, row));

	        // Lower half: 7, 5, 3, 1 stars
	        IntStream.range(n - 1, 0)
	                .forEach(row -> printRow(n, row));
	    }

	    /**
	     * Prints a single row of the diamond.
	     *
	     * @param n total size of the diamond
	     * @param row current row
	     */
	    private static void printRow(int n, int row) {

	        // Number of spaces before the stars
	        int spaces = n - row;

	        // Number of stars in the current row
	        int stars = 2 * row - 1;

	        System.out.println(
	                " ".repeat(spaces) +
	                "*".repeat(stars)
	        );
	    }


	    public static void main(String[] args) {

	        printDiamond(5);
	    }
	

}
