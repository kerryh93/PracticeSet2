package base;

public class MyInteger {

	// An int data field named iValue that stores the int value represented by
	// this object
	private int iValue;

	//A constructor that creates a MyInteger object for the specified iValue
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	//A get method that returns iValue
	public int getiValue() {
		return iValue;
	}
	
	//Methods isEven() that returns true if iValue is even
	public boolean isEven() {
		if (this.getiValue() % 2 == 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	//Methods isOdd() that returns true if iValue is odd
	public boolean isOdd() {
		if (this.getiValue() % 2 != 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	//Methods isPrime() that returns true if iValue is prime
	public boolean isPrime() {
		for (int i = 2; i < this.getiValue(); i++) {
			if (this.getiValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	//Static methods isEven(int) that returns true if the specified value is even
	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	//Static methods isOdd(int) that returns true if the specified value is odd
	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	//Static methods isPrime(int) that returns true if the specified value is prime
	public static boolean isPrime(int iValue) {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}

	//Static methods isEven(MyInteger)that returns true if the specified value is even
	public static boolean isEven(MyInteger iValue) {
		return iValue.isEven();
	}
	
	//Static methods isOdd(MyInteger)that returns true if the specified value is odd
	public static boolean isOdd(MyInteger iValue) {
		return iValue.isOdd();
	}
	
	//Static methods isPrime(MyInteger)that returns true if the specified value is prime
	public static boolean isPrime(MyInteger iValue) {
		return iValue.isPrime();
	}

	//Method equals(int) that returns true if the value in the object
	//is equal to the specified value
	public boolean equals(int i) {
		if (i==getiValue()){
			return true;
		}
		return false;
	}
	
	//Method equals(MyInteger) that returns true if the value in the object
	//is equal to the specified value
	public static boolean equals(MyInteger i){
		return i.equals(i.getiValue());
	}

}
