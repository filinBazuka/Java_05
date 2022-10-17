import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class OddEvenTest {

    // 1) В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    // Test Data:
    // -345 →  “Odd”
    // 0 →  “Even”
    // 222222 →  “Even”

    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {

        long number = 1;
        String expectedResult = "Odd";


        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
