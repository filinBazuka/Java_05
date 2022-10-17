import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.nio.file.Path;

public class OddEvenTest {

    // 1) В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    // Test Data:
    // -345 →  “Odd”
    // 0 →  “Even”
    // 222222 →  “Even”

    @Test
    public void testOddEvenHappyPathPositiveEvenNumberZero() {

        int number = 0;
        String expectedResult = "Even";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {

        int number = 1;
        String expectedResult = "Odd";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEvenHappyPathPositiveEvenNumber() {

        int number = 2;
        String expectedResult = "Even";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEvenHappyPathNegativeOddNumber() {

        int number = -1;
        String expectedResult = "Odd";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEvenHappyPathNegativeEvenNumber() {

        int number = -2;
        String expectedResult = "Even";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
