package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1.Lab1_1;

public class testLab2 {

	public static final double EPS = 0.1;
	@Test
	public void test1() {
		int[] arr = new int[] { 2, 5, 7, 9, 4};
		int expResult = 7;
		int result = Lab2_1.sumArithmeticMean(arr);
		System.out.print("sumArithmeticMean: " + expResult + " | " + result + "\n");
		assertEquals(expResult, result, EPS);

	}
}
