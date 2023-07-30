package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnotations {

    @Test(groups = "smoke")
    public void cccfirstTest(){
        System.out.println("This is my first testcase");

    }
    @Test(groups = "regression")
    public void aaasecondTest(){
        System.out.println("This is my second test");
    }

    @Test
    public void bbbthirdTest(){
        System.out.println("This is my third test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("PreCondition****************");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("PostCondition//////////////////");
    }


}
