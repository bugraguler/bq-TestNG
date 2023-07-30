package class02;

import org.testng.annotations.*;

public class TestingDemo2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite ANOTHER CLASS");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("before test ANOTHER CLASS");
    }


    @Test
    public void Test(){
        System.out.println("Testaa");
    }
    @Test
    public void Test2(){
        System.out.println("Testbb");
    }

}
