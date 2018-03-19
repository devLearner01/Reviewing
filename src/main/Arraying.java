package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arraying {

	static int[] integers;
	static int[] descendingSortedIntegers;


	public static void arraying() {

		integers = getIntegers(5);
		printArray(integers);
		sortIntegers();
		printArray( descendingSortedIntegers );
	}

	private static int[] getIntegers(int capacity){

		int[] input = new int[capacity];

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 numbers one by one: ");

		for(int i= 0; i<capacity; i++){
			input[i] = scan.nextInt();
		}
		return input;
	}

	private static void printArray(int[] array){

		for(int i: array){
			System.out.println(i);
		}
	}

	private static void sortIntegers(){

		Arrays.sort(integers);
		descendingSortedIntegers = new int[integers.length];

		for(int iSorted= integers.length-1, descend=0; iSorted>=0; iSorted--, descend++){
			descendingSortedIntegers[descend] = integers[iSorted];
		}
	}
}
