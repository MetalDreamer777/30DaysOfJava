package ep018to056;

import java.util.Arrays;

public class Ep038ArraysSortAndArraysParallelSort {
	public static void main(String[] args) {
		int[] grades = {1, 2, 3, 72, 5};
		Arrays.sort(grades);
		/*
		Arrays.parallelSort(); will do the same thing as Arrays.sort(); but is faster with large arrays because it splits a large array
		into chunks in the form of sub-arrays and processes those chunks in separate threads, then merges the sub arrays back together
		into one array again. It also checks the size of the array before processing it and if it is under a certain size it will just run
		it through a sequential sort algorithm.
		https://stackoverflow.com/questions/17328077/difference-between-arrays-sort-and-arrays-parallelsort
		https://www.baeldung.com/java-arrays-sort-vs-parallelsort#:~:text=Unlike%20sort()%2C%20which%20sorts,themselves%20sorted%20and%20then%20merged.
		*/
		System.out.println(Arrays.toString(grades));
	}
}
