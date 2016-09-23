package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEvenTest1() {
		int val1 = 3;
		MyInteger int1 = new MyInteger(val1);
		boolean incorrect = int1.isEven();
		assertEquals(false, incorrect);
	}
	@Test
	public void isEvenTest2() {
		int val2 = 4;
		MyInteger int2 = new MyInteger(val2);
		boolean correct = int2.isEven();
		assertEquals(true, correct);
	}
	@Test
	public void isOddTest1() {
		int val1 = 3;
		MyInteger int1 = new MyInteger(val1);
		boolean correct = int1.isOdd();
		assertEquals(true, correct);
	}
	@Test
	public void isOddTest2() {
		int val2 = 4;
		MyInteger int2 = new MyInteger(val2);
		boolean incorrect = int2.isOdd();
		assertEquals(false, incorrect);
	}
	@Test
	public void isPrimeTest1() {
		int val1 = 3;
		MyInteger int1 = new MyInteger(val1);
		boolean correct = int1.isPrime();
		assertEquals(true, correct);
	}
	@Test
	public void isPrimeTest2() {
		int val2 = 4;
		MyInteger int2 = new MyInteger(val2);
		boolean incorrect = int2.isPrime();
		assertEquals(false, incorrect);
	}
	@Test
	public void isEvenTest3() {
		boolean correct = MyInteger.isEven(6);
		assertEquals(true, correct);
	}
	@Test
	public void isEvenTest4() {
		boolean incorrect = MyInteger.isEven(5);
		assertEquals(false, incorrect);
	}
	@Test
	public void isOddTest3() {
		boolean incorrect = MyInteger.isOdd(6);
		assertEquals(false, incorrect);
	}
	@Test
	public void isOddTest4() {
		boolean correct = MyInteger.isOdd(5);
		assertEquals(true, correct);
	}
	@Test
	public void isPrimeTest3() {
		boolean correct = MyInteger.isPrime(7);
		assertEquals(true, correct);
	}
	@Test
	public void isPrimeTest4() {
		boolean incorrect = MyInteger.isPrime(8);
		assertEquals(false, incorrect);
	}
	@Test
	public void isEvenTest5() {
		MyInteger val = new MyInteger(7);
		boolean real = MyInteger.isEven(val);
		boolean expected = false;
		assertEquals(real, expected);
	}
	@Test
	public void isEvenTest6() {
		MyInteger val = new MyInteger(8);
		boolean real = MyInteger.isEven(val);
		boolean expected = true;
		assertEquals(real, expected);
	}
	@Test
	public void isOddTest5() {
		MyInteger val = new MyInteger(7);
		boolean real = MyInteger.isOdd(val);
		boolean expected = true;
		assertEquals(real, expected);
	}
	@Test
	public void isOddTest6() {
		MyInteger val = new MyInteger(8);
		boolean real = MyInteger.isOdd(val);
		boolean expected = false;
		assertEquals(real, expected);
	}
	@Test
	public void isPrimeTest5() {
		MyInteger val = new MyInteger(7);
		boolean real = MyInteger.isPrime(val);
		boolean expected = true;
		assertEquals(real, expected);
	}
	@Test
	public void isPrimeTest6() {
		MyInteger val = new MyInteger(8);
		boolean real = MyInteger.isPrime(val);
		boolean expected = false;
		assertEquals(real, expected);
	}
	@Test
	public void equalsTest1() {
		int x = 9;
		MyInteger val = new MyInteger(x);
		boolean result = val.equals(9);
		assertEquals(true, result);
	}
	@Test
	public void equalsTest2() {
		int x = 10;
		MyInteger val = new MyInteger(x);
		boolean result = val.equals(11);
		assertEquals(false, result);
	}
	@Test
	public void equalsTest3() {
		MyInteger val = new MyInteger(20);
		MyInteger val2 = new MyInteger(20);
		boolean real = val.equals(val2);
		boolean expected = true;
		assertEquals(real, expected);
	}
	@Test
	public void equalsTest4() {
		MyInteger val = new MyInteger(20);
		MyInteger val2 = new MyInteger(11);
		boolean real = val.equals(val2);
		boolean expected = false;
		assertEquals(real, expected);
	}
}
