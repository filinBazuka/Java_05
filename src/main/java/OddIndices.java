public class OddIndices {

    // 2)  Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    // Test Data:
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}

    public int[] oddIndices(int[] massiv2) {

        int[] result = new int[0];

        if (massiv2.length > 1) {

            result = new int[(massiv2.length / 2)];
            int count = 0;
            for (int i = 1; i < massiv2.length; i += 2) {
                result[count] = massiv2[i];
                count++;
            }

            return result;
        }

        return result;
    }
}
