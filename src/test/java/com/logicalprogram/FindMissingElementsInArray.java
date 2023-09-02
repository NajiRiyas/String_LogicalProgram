package com.logicalprogram;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElementsInArray {

	// This function will find the missing number
	// in an array and print it
	
	private static void findMissingNumbers(int[] number){
		
	// take the max length as new array
		int k[] = new int[number[number.length-1]];
	// defining incrementor
		int m = 0;
	// Logic to add the element in the missing element before 
	// first element in an array
		if(number[0]!=1){
			for (int x =1; x <number[0]; x++){
				k[m] = x;
				m++;
			}
			
		}
			
	// logic to print the remaining missing element 
	// on the basic of difference
			
		for (int i = 0; i <number.length-1 ; i++){
			int j = i +1;
			int differnce = number[j] - number[i];
			
			if(differnce!=1){
				// Adding the element in the incremental order
				// till the difference is 1
				
				for (int x= 1; x < differnce; x ++){
					k[m] = number [i] + 1;
					m++;
				}
				
			}
			
		}
		
		System.out.println("Missing numbers in an array:");
		
		for (int i = 0; i <m; i++){
			System.out.println(k[i]+ " ");
		}
		
		
	}

	//driver method
	public static void main(String[] args) {


		System.out.println("Please enter the array");
		
		Scanner sc = new Scanner(System.in);
		
		int [] number =  new int [5];
		
		for (int i = 0; i < number.length; i ++){
			System.out.println("please enter the number");
			
			number[i] = sc.nextInt();
		}
		sc.close();
		// sort an array
		Arrays.sort(number);
		//
		findMissingNumbers(number);
	}

}
	
	

