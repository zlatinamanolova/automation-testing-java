package automation;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeTest {
	
	
	@Test
	public void test1() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
	
	@Test
	public void test2() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
	
	@Test
	public void test3() {
		System.out.println("Thread name: " +  Thread.currentThread().getName());
	}

	@Test
	public void test4() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		Assert.assertTrue(false, "Faaaaail BUUUUG ne rabotiii onova");
	}
	
	@Test
	public void test5() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}

}
