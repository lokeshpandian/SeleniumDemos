package testcases;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
    @DataProvider(name = "logindetails")
    public String[][]data(){
        String [][] testData = {
                { "lokesh", "Password123"},
                { "student", "Password123"},
                { "incorrectUser", "Password123"}

        };
        return testData;
    }
}
