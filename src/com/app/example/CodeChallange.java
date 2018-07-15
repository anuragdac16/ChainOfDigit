package com.app.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		char[] ch = new char[num.length()];
		String str = "";

		for (int i = 0; i < num.length(); i++) {
			ch[i] = num.charAt(i);

		}

		Arrays.sort(ch);

		for (int i = 0; i < ch.length; i++) {
			str = str + ch[i];
		}

		StringBuffer buff = new StringBuffer(str);
		buff.reverse();
		str = new String(buff);
		number = Integer.parseInt(str);

		return number;
	}

	public int sortNumberInAsendingOrder(int number) {
		Integer number1 = new Integer(number);
		String num = number1.toString();
		char[] ch = new char[num.length()];
		String str = "";

		for (int i = 0; i < num.length(); i++) {
			ch[i] = num.charAt(i);

		}

		Arrays.sort(ch);

		for (int i = 0; i < ch.length; i++) {
			str = str + ch[i];
		}

		number = Integer.parseInt(str);

		return number;
	}

	public static void main(String[] args) {
		CodeChallange challange = new CodeChallange();
		int result = challange.numberOfChain(444);
		System.out.println(result);
	}

}
