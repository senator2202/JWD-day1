package test.kharitonov.day1.entity;

import com.kharitonov.day1.entity.TaskFunction;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskFunctionTest {
    TaskFunction taskFunction = new TaskFunction();

    @BeforeTest
    private void init() {
        taskFunction = new TaskFunction();
    }

    @DataProvider(name = "dataForSignature")
    public Object[][] dataForSignature() {
        return new Object[][]{
                {-10, "1/(x^3-6)"},
                {0, "1/(x^3-6)"},
                {3, "-x^2+3*x+9"},
                {25, "-x^2+3*x+9"}
        };
    }

    @Parameters({"x", "expectedResult"})
    @Test(dataProvider = "dataForSignature", groups = "signature")
    public void testGetSignature(double x, String expectedResult) {
        String actualResult = taskFunction.getSignature(x);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "dataForValue")
    @Test(groups = "value")
    public Object[][] dataForValue() {
        return new Object[][]{
                {0, -0.166667},
                {1, -0.2},
                {3, 9},
                {5, -1}
        };
    }

    @Parameters({"x", "expectedResult"})
    @Test(dataProvider = "dataForValue", groups = "value")
    public void testGetValue(double x, double expectedResult) {
        double actualResult = taskFunction.value(x);
        Assert.assertEquals(actualResult, expectedResult, 0.000001);
    }
}