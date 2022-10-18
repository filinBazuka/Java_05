public class SumArray {

    // 3) Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    // Test Data:
    // {0, 1, 2, 3, 4, 5} → 15
    // {-7, -3} → -10

    public int sumArray3(int[] massiv3) {

        int sum = 0;

        if (massiv3.length > 0) {
            for (int i = 0; i < massiv3.length; i++) {
                sum = sum + massiv3[i];
            }

            return sum;
        }

        return sum;
    }
}
