public class MinMaxAve {

    // 8) Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    // Test Data:
    // ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public int[] minMaxAve(int[] massiv8, int min, int max) {

        int[] result = new int[0];

        if (massiv8.length > 0 && max >= min && max <= massiv8.length) {

            result = new int[3];
            result[0] = massiv8[min];
            result[1] = massiv8[max];

            int sum = 0;
            for (int i = min; i <= max; i++) {
                sum = sum + massiv8[i];
            }

            result[2] = sum / ((max - min) + 1);

            return result;
        }

        return result;
    }
}
