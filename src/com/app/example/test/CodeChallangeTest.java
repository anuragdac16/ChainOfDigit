package com.app.example.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.example.CodeChallange;

public class CodeChallangeTest {

	private static CodeChallange codeChallange = null;

	@BeforeClass
	public static void setUp() {
		codeChallange = new CodeChallange();
	}

	@Test
	public void testNumberOfChain() {

		Assert.assertEquals(2, codeChallange.numberOfChain(123456789));
		Assert.assertEquals(2, codeChallange.numberOfChain(444));
		Assert.assertEquals(4, codeChallange.numberOfChain(1234));
	}
	
	@Test
	public void testSortNumberInAsendingOrder() {
		Assert.assertEquals(1234, codeChallange.sortNumberInAsendingOrder(2314));
	}

	@Test
	public void testSortNumberInDesendingOrder() {
		Assert.assertEquals(4321, codeChallange.sortNumberInDesendingOrder(2314));
	}

}
