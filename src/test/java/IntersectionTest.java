import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    // 9) Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и
    // возвращает массив общих элементов.
    // Test Data:
    // {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    // {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    // {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    @Test
    public void testIntersectionHappyPathPositiveNumber() {

        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testIntersectionHappyPathNegativeNumber() {

        int[] firstArray = {1, 2, 4, 5, 8, 9};
        int[] secondArray = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testIntersectionHappyPathNoMatchesNumber() {

        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 45};
        int[] expectedResult = {};

        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
