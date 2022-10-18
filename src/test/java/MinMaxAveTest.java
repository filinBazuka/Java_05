import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    // 8) Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    // Test Data:
    // ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    @Test
    public void testMinMaxAveTestHappyPath() {

        int[] massiv8 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int min8 = 2;
        int max8 = 6;
        int[] expectedResult = new int[]{3, 7, 5};

        int[] actualResult = new MinMaxAve().minMaxAve(massiv8, min8, max8);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
