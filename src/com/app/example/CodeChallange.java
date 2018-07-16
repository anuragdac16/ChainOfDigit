package com.app.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodeChallange {

	public int numberOfChain(int number) {
		List<Integer> list = new ArrayList<>();
		int chain = 1;
		int descendingNumber = sortNumberInDesendingOrder(number);
		int ascendingNumber = sortNumberInAsendingOrder(number);
		while (true) {
			int result = descendingNumber - ascendingNumber;

			descendingNumber = sortNumberInDesendingOrder(result);
			ascendingNumber = sortNumberInAsendingOrder(result);
			if (!list.contains(result)) {
				chain++;
				list.add(result);
			} else
				break;
		}

		return chain;
	}

	public int sortNumberInDesendingOrder(int number) {
		Integer number1 = new Integer(number);
		String num = number1.toString();
		char[] ch = num.toCharArray();
		String str = "";

		Arrays.sort(ch);

		str = String.copyValueOf(ch);
		StringBuffer buff = new StringBuffer(str);
		buff.reverse();
		str = new String(buff);
		number = Integer.parseInt(str);

		return number;
	}

	public int sortNumberInAsendingOrder(int number) {
		Integer number1 = new Integer(number);
		String num = number1.toString();
		char[] ch = num.toCharArray();
		String str = "";

		Arrays.sort(ch);

		str = String.copyValueOf(ch);

		number = Integer.parseInt(str);

		return number;
	}

	public static void main(String[] args) {
		CodeChallange challange = new CodeChallange();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number		:	");
		int number = scan.nextInt();
		System.out.println("Number of chain 	:	"+challange.numberOfChain(number));
		
		scan.close();
	}

}
