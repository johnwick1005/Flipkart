package org.test;

import org.testng.annotations.Test;

public class B {

	
	@Test
	private void tc4() {
		System.out.println("Test 4 :"+Thread.currentThread().getId());

	}
	
	@Test
	private void tc5() {
		System.out.println("Test 5 :"+Thread.currentThread().getId());

	}
	
	@Test
	private void tc6() {
		System.out.println("Test 6 :"+Thread.currentThread().getId());

	}
	
	@Test
	private void tc7() {
		System.out.println("Test 7 :"+Thread.currentThread().getId());

	}
	
	
}
