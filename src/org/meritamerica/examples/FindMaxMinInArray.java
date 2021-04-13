/**
 * 
 */
package org.meritamerica.examples;

/**
 * @author irinababkina
 *
 */
public class FindMaxMinInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers = {3, 7, 1, 32, 25, 77, 70, 128};
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}				
		}
		System.out.println("The max number in the array is " + max);
		
		
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}				
		}
		System.out.println("The min number in the array is " + min);
	}
	
}