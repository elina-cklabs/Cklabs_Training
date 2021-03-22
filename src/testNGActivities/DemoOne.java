package testNGActivities;


import org.testng.annotations.Test;

public class DemoOne {
    @Test(groups= {"HeaderTests"})
    public void firstTestCase() {
        System.out.println("I'm in first test case from demoOne Class");
    }

    @Test(groups= {"HeaderTests"})
    public void secondTestCase() {
        System.out.println("I'm in second test case from demoOne Class");
    }
}