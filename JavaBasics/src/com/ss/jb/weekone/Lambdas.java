package com.ss.jb.weekone;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lambdas {

	public static boolean check(PerformOperation operation, int num) {
		return operation.check(num);
	}
	public static PerformOperation isOdd() {
		return (n) ->n%2 == 0 ? true : false;
	}
	
	public static PerformOperation isPrime() {
		return (n) -> {
			for(int i = 2;i <= n/2; i++) {
				if(n%i == 0) return false;
			}
			return true;
		};
	}
	
	public static PerformOperation isPalindrome() {
		 return (a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
	}
	
	public static void main(String[] args) {
		PerformOperation operation;
		boolean result;
		String answer = null;
		
		//try (Scanner scan = new Scanner(new File("resources/LambdaSample.txt"))) {
		try (Scanner scan = new Scanner(System.in)) {
			int cases = scan.nextInt();
			for (int i = 0; i<cases;i++) {
				int methodCall = scan.nextInt();
				int num = scan.nextInt();
				switch (methodCall) {
					case 1:
						operation = isOdd();
						result = check(operation, num);
						answer = result ? "EVEN" : "ODD";
						break;
					case 2:
						operation = isPrime();
						result = check(operation, num);
						answer = result ? "Prime" : "Composite";
						break;
					case 3:
						operation = isPalindrome();
						result = check(operation, num);
						answer = result ? "Palindrome" : "Non-Palindrome";
						break;
				}
				System.out.println(answer);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
