public class EightLesson {
   public static String[] digits = {"ноль", "один", "два", "три", "четыре",
            "пять", "шесть", "семь", "восемь", "девять"};

    public static String numberToWords(int number) {
        StringBuilder result = new StringBuilder();
        while(number>0) {
            int digit = number % 10;
            result.insert(0, digits[digit] + " ");
            number /= 10;
        }

        return result.toString().trim();
    }
}
