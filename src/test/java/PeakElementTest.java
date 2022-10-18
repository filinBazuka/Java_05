import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    // 10) Написать алгоритм PeakElement,  который принимает на вход массив целых чисел
    // и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
    // Test Data:
    // {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElementHappyPathPeakElement() {

        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        int[] actualResult = new PeakElement().peakElement(a);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testPeakElementOneValue() {

        int[] a = {3};
        int[] expectedResult = {};

        int[] actualResult = new PeakElement().peakElement(a);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
