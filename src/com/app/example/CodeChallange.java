package com.app.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CodeChallange {

	public Set<Integer> numberOfChain(int number) {
		Set<Integer> set = new LinkedHashSet<>();
		int chain = set.size() - 1;
		int descendingNumber = sortNumberInDesendingOrder(number);
		int ascendingNumber = sortNumberInAsendingOrder(number);

		while (!(set.size() == chain)) {
			int result = descendingNumber - ascendingNumber;
			descendingNumber = sortNumberInDesendingOrder(result);
			ascendingNumber = sortNumberInAsendingOrder(result);
			chain++;
			set.add(result);
		}

		return set;
	}

	public int sortNumberInDesendingOrder(int number) {

		char[] ch = Integer.toString(number).toCharArray();
		Arrays.sort(ch);
		return Integer.parseInt(new StringBuffer(String.copyValueOf(ch)).reverse().toString());
	}

	public int sortNumberInAsendingOrder(int number) {
		char[] ch = Integer.toString(number).toCharArray();
		Arrays.sort(ch);
		return Integer.parseInt(String.copyValueOf(ch));

	}

	public void printDetail() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number		:	");
		int number = scan.nextInt();
		
		System.out.println(sortNumberInDesendingOrder(number) + " - " + sortNumberInAsendingOrder(number) + " = " + (sortNumberInDesendingOrder(number) - sortNumberInAsendingOrder(number)));
		
		Set<Integer> set = numberOfChain(number);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(sortNumberInDesendingOrder(integer) + " - " + sortNumberInAsendingOrder(integer) + " = " + (sortNumberInDesendingOrder(integer) - sortNumberInAsendingOrder(integer)));
		}
		System.out.println("chain length	:	" + (set.size() + 1));

		scan.close();
	}

}
