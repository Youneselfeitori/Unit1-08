/****************************************************************************
 *
 * Created by: Younes Elfeitori
 * Created on: 20 sep 2018
 * This is a program about find max and min number is the range of 100
 *
 ****************************************************************************/
public class MinMax {

	public static void main(String[] args) {
		int array [] = new int[10];
		
		for(int number = 0; number < array.length;number++) {
			array[number] = (int) (Math.random()*99);
		    System.out.println(array[number]);
		}
		max(array[0], array);
		min(array[0], array);
	}
	
	public static void max(int maxValue,int[] array) {
		for(int max = 1; max < array.length; max++) {
			if(array[max] > maxValue) {
				maxValue = array[max];
			}	
		}
		System.out.println("Max Value: " + maxValue);
	}
	public static void min(int minValue,int[] array) {
		for(int min = 1; min < array.length; min++) {
			if(array[min] < minValue) {
				minValue = array[min];
			}

	    }
		System.out.println("Min Value: " + minValue);	
	}
	
}
