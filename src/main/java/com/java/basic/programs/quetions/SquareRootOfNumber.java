package com.java.basic.programs.quetions;

import java.util.Scanner;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ");

		int n = sc.nextInt();

//		We can consider (√x-√x)2  = 0.
//				Replacing one of the √x‘s with y, then the equation becomes (y-√x)2 => y2 – 2y√x + x = 0
//				=> √x = (y2 + x) / 2y
//				=> √x = (y + x/y) / 2
//
//				In the above equation, we are considering √x as z.
//				So, to get a required decimal value we can compare the difference of y and z to 10-p (to get the result upto 5 decimal digits, compare y-z to 10-5=0.00001). Until y-z exceeds it, the iteration 

		int l = 1;
		int h = n;
		double sqrrt = SquareRoot(n, l, h);

		System.out.println("square root of number " + sqrrt);
	}

	private static double SquareRoot(int n, int l, int h) {
		// TODO Auto-generated method stub

		while (l < h) {
			int mid = (l + h) / 2;
			if ((mid * mid <= n) && ((mid + 1) * (mid + 1) > n)) {
				return mid;
			}  else if (mid * mid < n)
				return SquareRoot(n, mid + 1, h);
			else if (mid * mid > n) {
				return SquareRoot(n, l, mid - 1);

			}

		}
		return l;

	}

	// method2 using binary search
	private static double SquareRoot(int n) {
		// TODO Auto-generated method stub
		if (n < 2) {
			return n;
		}
		double low = 1, high = n;
		while (low <= high) {
			double mid = (low + high) / 2;
			if (mid * mid == n) {
				return mid;
			} else if (mid * mid < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return high;

	}

	// methd 1
//	private static double SquareRoot(int n) {
//		double sr = n / 2;
//		double temp = 0;
//
//		while (temp - sr != 0) {
//			temp = sr;
//			sr = (temp + (n / temp)) / 2;
//		}
//		return sr;
//	}

	// method 1
//	private static double SquareRoot(int n) {
//		double sr = n / 2;
//		double temp;
//
//		do {
//			temp = sr;
//			sr = (temp + (n / temp)) / 2;
//		} while (temp - sr != 0);
//		return sr;
//	}

}
