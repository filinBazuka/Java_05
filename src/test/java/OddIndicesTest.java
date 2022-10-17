import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    // 2)  Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    // Test Data:
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}

    @Test
    public void testOddIndicesHappyPathArrayGreaterThanZero() {

        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndicesHappyPathArrayIsOne() {

        int[] array = new int[]{-45};
        int[] expectedResult = new int[]{};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndicesHappyPathArrayWithTwoCells() {

        int[] array = new int[]{-45, 590};
        int[] expectedResult = new int[]{590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndicesNegativePathArrayZero() {

        int[] array = new int[]{};
        int[] expectedResult = new int[]{};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
