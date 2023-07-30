package class02;

import org.testng.annotations.*;

public class Testing {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @Test
    public void Test() {
        System.out.println("test1");
    }

    @Test(groups = "smoke")
    public void Test2() {
        System.out.println("test2");
    }

    @Test
    public void Test3() {
        System.out.println("test3");
    }


}
