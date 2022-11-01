package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class456 {
	@BeforeTest
	public static void btest() {
		System.out.println("beforetest-----Class456");
	}
	@BeforeClass
	public static void bclass() {
		System.out.println("beforeclASS-----Class456");
	}
	@BeforeMethod
	public static void bemethod() {
		System.out.println("Before methoid --Class456");
	}
@Test
public static void test() {
	System.out.println("test-1-----Class456");
}
@AfterMethod
public static void aemethod() {
	System.out.println("Aftermethoid --Class456");
}
@AfterClass
public static void Aclass() {
	System.out.println("AfterclASS-----Class456");
}
@AfterTest
public static void Atest() {
	System.out.println("afteretest-----Class456");
}
}
