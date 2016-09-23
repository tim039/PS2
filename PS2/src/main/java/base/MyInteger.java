package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;

	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int i) {
		if (i % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int j) {
		for (int i = 2; i < j; i++) {
			if (j % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger num) {
		int val = num.getiValue();
		if (val % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger num) {
		int val = num.getiValue();
		if (val % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(MyInteger num) {
		int val = num.getiValue();
		for (int i = 2; i < val; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int i) {
		if (i == iValue) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger num) {
		if (num.getiValue() == getiValue()) {
			return true;
		} else {
			return false;
		}
	}

}
