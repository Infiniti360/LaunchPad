package ArrayLaunchPad;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShufflingNumbersToRandomPosition {

	public static void main(String[] args) {

		int size;
		
		Scanner sc=new Scanner(System.in);  

		System.out.println("Enter the Number List size");

		size=sc.nextInt();  
		
		int[] numberArray = new int[size];
		int[] shuffledArray = new int[size];


		System.out.println("Enter the Number List ");

		for (int i=0; i<size; i++)
		{
			numberArray[i]=sc.nextInt();
		}
		
		System.out.println("The Number Array is :  " );
		
		for (int i=0; i<size; i++)
		{
			System.out.print(numberArray[i] + " \t" );
		}
		
		Random rand = new Random();
		
		for (int i = 0; i< numberArray.length; i++)
		{
			int randomIndexToSwap = rand.nextInt(numberArray.length);
			System.out.println("\n I "+ i + " randomIndexToSwap  "+ randomIndexToSwap);
			int temp =  numberArray[randomIndexToSwap];
			numberArray[randomIndexToSwap] =  numberArray[i];
			numberArray[i] = temp;
		}
		
		System.out.println("The Shuffled Number Array is :  " );
		
		for (int i=0; i<size; i++)
		{
			System.out.print(numberArray[i] + " \t" );
			
		}

		System.out.print(Arrays.toString(numberArray)  );

	}

}
