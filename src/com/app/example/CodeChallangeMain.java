package com.app.example;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CodeChallangeMain {

	public static void main(String[] args) {

		
		printDetail();
	}

	public static void printDetail() {
		CodeChallange challange = new CodeChallange();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number		:	");
		int number = scan.nextInt();

		// Printing first line on console
		System.out.println(challange.sortNumberInDesendingOrder(number) + " - "
				+ challange.sortNumberInAsendingOrder(number) + " = "
				+ (challange.sortNumberInDesendingOrder(number) - challange.sortNumberInAsendingOrder(number)));

		Set<Integer> set = challange.numberOfChain(number);
		Iterator<Integer> itr = set.iterator();
		// Printing remaining line on console
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();

			System.out.println(challange.sortNumberInDesendingOrder(integer) + " - "
					+ challange.sortNumberInAsendingOrder(integer) + " = "
					+ (challange.sortNumberInDesendingOrder(integer) - challange.sortNumberInAsendingOrder(integer)));

		}
		System.out.println("chain length	:	" + (set.size() + 1));

		scan.close();
	}

}
