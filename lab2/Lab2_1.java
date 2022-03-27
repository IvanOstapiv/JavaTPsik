package lab2;

import java.util.Random;
import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		Lab2_1 prog = new Lab2_1();
		prog.program1();

	}
public void program1() {
		
		int min = -100;
	    int max = 100;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int perevirka = -1;
	    System.out.println("Введіть кількість елементів масиву");
	    int size = input.nextInt(); 
	    
	    int array[] = new int[size];
	    System.out.println("Виберіть спосіб введення даних:\n1)с клавіатури\n2)рандомно");
	    int viberka = input.nextInt();
	    if(viberka==1)
	    {
	    System.out.println("Введіть елементи масиву:");
	    
	    for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt(); 
	    	}
	    }
	    else if(viberka==2)
	    {
	    	for (int i = 0; i < array.length; i++)
	    		array[i] = random.nextInt(max - min) + min;
	    }
	    else
	    {
	    	System.out.print ("Такого способу введення не існує.");
	    	perevirka = 0;
	    }
	    
	    System.out.print ("Введені елементи масиву:");
	    for (int i = 0; i < size; i++) {
	        System.out.print (" " + array[i]);
	    }
	    int sum = sumArithmeticMean(array);
	    System.out.println("\nсереднє арифметичне непарних елементів одновимірного масиву = " + sum);
}
	    
	    
	public static int sumArithmeticMean(int arr[]) {
		int sum = 0;
		int count = 0;
		for (int element : arr) {
			if (element %2 != 0 ) {
				count+=1;
				sum+=element;
			}
		}
		return sum/count;
	}

}
