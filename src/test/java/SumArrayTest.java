import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    // 3) Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    // Test Data:
    // {0, 1, 2, 3, 4, 5} → 15
    // {-7, -3} → -10

    @Test
    public void testSumArrayHappyPathArrayGreaterThanZero1() {

        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray3(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayHappyPathArrayGreaterThanZero2() {

        int[] array = new int[]{-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray3(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayHappyPathArrayIsNull() {

        int[] array = new int[]{};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray3(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
