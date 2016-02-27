package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	//Static Constructor
	static MyInteger object2;
	static MyInteger object3;
	static MyInteger object4;
	//Static integer
	static int num;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Set variables before each test 
		object2 = new MyInteger(2);
		object3 = new MyInteger(3);
		object4 = new MyInteger(4);
		num = 5;
		
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
	
	
	//test on isEven()
	@Test
	public void testIsEven() {
		int iIntegerTestValue = 2;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed", bExpectedresult, bActualResult);

		
	}
	@Test
	public void testIsEvenfalsecase() {

		int iIntegerTestValue = 1;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = false;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed", bExpectedresult, bActualResult);
	}
	
	//Test on isEven(int)
	@Test
	public void testIsEvencase2() {
		assertTrue("testIsEven() failed", MyInteger.isEven(2));
	}
	
	@Test
	public void testIsEvencase3(){
		assertFalse("testIsEven() failed", MyInteger.isEven(1));
	}
	
	//Test on isEven(MyInteger)
	@Test
	public void testIsEvencase4(){
		assertTrue("testIsEven() failed", MyInteger.isEven(object2));
		
	}
	
	@Test
	public void testIsEvencase5(){
		assertFalse("testIsEven() failed", MyInteger.isEven(object3));
		
	}
	
	
	//Test on isOdd()
	@Test
	public void testIsOdd() {
		int iIntegerTestValue = 1;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isOdd();
		assertEquals("testIsOdd() failed", bExpectedresult, bActualResult);
		
	}
	
	@Test
	public void testIsOddfalsecase() {
		int iIntegerTestValue = 2;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = false;
		boolean bActualResult = instance.isOdd();
		assertEquals("testIsOdd() failed", bExpectedresult, bActualResult);
	
	}
	
	//Test on isOdd(int)
	@Test
	public void testIsOddcase2() {
		assertTrue("testIsOdd() failed", MyInteger.isOdd(1));
	}
	@Test
	public void testIsOddcase3(){
		assertFalse("testIsOdd() failed", MyInteger.isOdd(2));
	}
	
	//Test on isOdd(MyInteger)
	@Test
	public void testIsOddcase4(){
		assertTrue("testIsOdd() failed", MyInteger.isOdd(object3));
		
	}
	@Test
	public void testIsOddcase5(){
		assertFalse("testIsOdd() failed", MyInteger.isOdd(object2));
		
	}
	
	//Test on isPrime()
	@Test
	public void testIsPrime() {
		int iIntegerTestValue = 3;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isPrime();
		assertEquals("testIsPrime() failed", bExpectedresult, bActualResult);
		
	}
	
	@Test
	public void testIsPrimefalsecase() {
		int iIntegerTestValue = 6;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = false;
		boolean bActualResult = instance.isPrime();
		assertEquals("testIsPrime() failed", bExpectedresult, bActualResult);
	
	}
	//Test isPrime(int)
	@Test
	public void testIsPrimecase2() {
		assertTrue("testIsPrime() failed", MyInteger.isPrime(2));
	}
	
	@Test
	public void testIsPrimecase3(){
		assertFalse("testIsPrime() failed", MyInteger.isPrime(4));
	}
	//Test isPrime(MyInteger)
	@Test
	public void testIsPrimecase4(){
		assertTrue("testIsPrime() failed", MyInteger.isPrime(object3));
		
	}
	
	@Test
	public void testIsPrimecase5(){
		assertFalse("testIsPrime() failed", MyInteger.isPrime(object4));
		
	}
	
	//test on equals()
	@Test
	public void testequal(){
		boolean bExpectedresult = true;
		boolean bActualResult = object2.equals(2);
		assertEquals("testIsEqual() failed",bExpectedresult,bActualResult);
		
	}
	@Test
	public void testequalfalse(){
		boolean bExpectedresult = false;
		boolean bActualResult = object2.equals(10);
		assertEquals("testIsEqual() failed",bExpectedresult,bActualResult);
		
	}
	@Test
	public void testequals1(){
		boolean bExpectedresult = true;
		boolean bActualResult = object4.equals(object4);
		assertEquals("testIsEqual() failed",bExpectedresult,bActualResult);
	}
	@Test
	public void testequalsfalse2(){
		assertFalse(object2.equals(num));
	}
	
}
