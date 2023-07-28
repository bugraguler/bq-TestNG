package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 4)
    public void FirstTEst(){
        System.out.println("1st");

    }
    @Test(priority = 2)
    public void SecondTest(){
        System.out.println("2nd");

    }
    @Test
    public void ThirdTest(){
        System.out.println("3rd");

    }
}
