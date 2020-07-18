package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"a","b","c","d","e"};
		printStrings(strings);
		printStringsReverse(strings);
		printStringsOther(strings);
		printRandomString(strings);
	}
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringsReverse(String[] arr) {
		for(int i = arr.length-1; i >= 0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printStringsOther(String[] arr) {
		for(int i = 0; i < arr.length;i+=2) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printRandomString(String[] arr) {
		boolean[] selected = new boolean[arr.length];
		boolean contains = false;
		Random ran = new Random();
		int index;
		for(int i = 0;i < selected.length;i++) {
			selected[i] = true;
		}
		while(contains == false) {
			contains = true;
			index = ran.nextInt(arr.length);
			
			if(selected[index] == true) {
			System.out.print(arr[index]);
			}
			selected[index] = false;
			for(int i = 0;i < selected.length;i++) {
				if(selected[i] == true) {
					contains = false;
				}
			}
		}
	}
	
}
