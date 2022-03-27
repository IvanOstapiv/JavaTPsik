package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testLab1 {

	public static final double EPS = 0.1;
	@Test
	public void test1() {
		int[] arr = new int[] { 7, 1, 0, 2, 2};
		int expResult = 4;
		int result = Lab1_1.sumAfterZero(arr);
		System.out.print("sumAfterZero: " + expResult + " | " + result + "\n");
		assertEquals(expResult, result, EPS);
	}
	@Test
	public void test2() {
		int[] arr = new int[] { 55, 2, -66, 12, 23};
		int expResult = -66;
		int result = Lab1_1.maxNum(arr);
		System.out.print("maxNum: " + expResult + " | " + result + "\n");
		assertEquals(expResult, result, EPS);

  }
}
