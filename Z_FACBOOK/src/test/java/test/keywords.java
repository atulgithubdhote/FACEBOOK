package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keywords{
	
	@BeforeClass
	public static void bclass() {
		System.out.println("beforeclASS-----Class123");
	}
	@BeforeMethod
	public static void bemethod() {
		System.out.println("Before methoid --Class123");
	}
@Test
public static void test() {
	System.out.println("test-1-----");
}@Test (priority=1)
public static void test2() {
	System.out.println("test-2-----");
}
@Test(dependsOnMethods= {"test2"})
public static void test3() {
	System.out.println("test-3-----");
}
@Test (invocationCount=3)
public static void test4() {
	System.out.println("test-4-----");
}
@AfterMethod
public static void aemethod() {
	System.out.println("Aftermethoid --Class123");
}
@AfterClass
public static void Aclass() {
	System.out.println("AfterclASS-----Class123");
}

}
