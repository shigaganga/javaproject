package JavaHackathon;

import java.util.Scanner;

//Q34. Write a method to implement *, - , / operations. You should use only the + operator


public class Q34plusOperator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        sc.close();

        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        try {
            System.out.println("Division: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		 if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        int quotient = 0;
	        int xAbs = Math.abs(a);
	        int yAbs = Math.abs(b);
	        while (xAbs >= yAbs) {
	            xAbs = subtract(xAbs, yAbs);
	            quotient++;
	        }
	        if ((a< 0 && b > 0) || (a > 0 && b< 0)) {
	            quotient = negate(quotient);
	        }
	        return quotient;
	    }
	private static int multiply(int a, int b) {
		// TODO Auto-generated method stub
		 int result = 0;
	        for (int i = 0; i < Math.abs(b); i++) {
	            result += a;
	        }
    if (b < 0) {
        result = negate(result);
    }
    return result;
	}
	 public static int subtract(int a, int b) {
	        return a + negate(b);
	 }
	private static int negate(int num) {
		  return ~num + 1;

}}
