package com.app.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodeChallange {

	public int numberOfChain(int number) {
		Set<Integer> set = new HashSet<>();
		int chain = set.size() -1;
		int descendingNumber = sortNumberInDesendingOrder(number);
		int ascendingNumber = sortNumberInAsendingOrder(number);
		
		while (!(set.size() == chain)) {
			int result = descendingNumber - ascendingNumber;
			descendingNumber = sortNumberInDesendingOrder(result);
			ascendingNumber = sortNumberInAsendingOrder(result);
			chain++;
			set.add(result);
			
		}

		return set.size()+1;
	}

	public int sortNumberInDesendingOrder(int number) {
		Integer number1 = new Integer(number);
		String num = number1.toString();
		char[] ch = num.toCharArray();

		Arrays.sort(ch);

		String str = String.copyValueOf(ch);
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
		Arrays.sort(ch);
		String str = String.copyValueOf(ch);
		number = Integer.parseInt(str);

		return number;
	}

	
}
