package com.app.example;

import java.util.Scanner;

public class CodeChallangeMain {

	public static void main(String[] args) {
		CodeChallange challange = new CodeChallange();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number		:	");
		int number = scan.nextInt();
		System.out.println("Number of chain 	:	" + challange.numberOfChain(number));

		scan.close();
	}

}
