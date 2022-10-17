public class OddEven {

    // 1) В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    // Test Data:
    // -345 →  “Odd”
    // 0 →  “Even”
    // 222222 →  “Even”

    public String oddEven(long number) {
        String odd = "Odd";
        String even = "Even";

        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return "Ошибка!";
    }
}
