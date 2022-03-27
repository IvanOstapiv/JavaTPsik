package lab1;

import java.util.Random;
import java.math.*;
import java.util.Scanner;


public class Lab1_1 {
	

	public static void main(String[] args) {
		Lab1_1 prog = new Lab1_1();
		prog.program();
	}
	public void program() {
		
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
	    
	    //***********************************************
	    int maxNum = maxNum(array);
	    int sumAfterZero = sumAfterZero(array);
	    System.out.println("\nмаксимальний за модулем елемент масиву = " + maxNum);
	    System.out.println("\nсума елементів масиву, розташованих після останнього нульового елемента. = "+ sumAfterZero);
	}
	
	
	    public static int maxNum(int arr[]) {
	    	int maxNumber = arr[0];
	        for (int element : arr) {
	          if (Math.abs(element) > Math.abs(maxNumber)) {
	            maxNumber = element;
	          }
	        }
	    return maxNumber;
        }
	    	
	    
	    
        public static int sumAfterZero(int arr[]) {
           	int zeroNum = arr[0];
           	int index = -1;
           	int sum = 0;
           	for (int i = 0; i < arr.length; i++)
           	{
           	 if(arr[i] == 0){
           		zeroNum = arr[i];
           	}
           	 if(zeroNum == arr[i])
           	 {
           		 index = i;
           	 }
           	 
        }
           	if(index == 0)
           	{
           		System.out.println("\nВ масиві немає нулів");
           		return 0;
           	}
           	for (int i = index; i < arr.length; i++) {
    			sum += arr[i];
    		}
           	if(sum == 0)
           	{
           		System.out.println("\nПісля нуля немає елементів");
           		return 0;
           	}
           		return sum;      	
        }
       
}
