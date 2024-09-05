import java.util.stream.Collectors;

public class FifthLessonAboutString {
    public static String s = "Перестановочный алгоритм быстрого действия";
    public static String str = "Перевыборы выбранного президента";
    String[][] array = {
            {"Привет”, “всем”, “кто"},
            {"изучает", "язык", "программирования"},
            {"java"}
    };

    public static void print_o() {
        String result = s.chars() // получаем IntStream
                .mapToObj(c -> (char) c) // преобразуем int в char
                .filter(c -> c == 'О' || c == 'о') // фильтруем только 'О' и 'о'
                .map(String::valueOf) // преобразуем char обратно в String
                .collect(Collectors.joining(" ")); // объединяем в строку с разделителем ", "

        System.out.println(result);
    }

    public static void count_e() {
        long cnt = str.chars() // получаем IntStream
                .mapToObj(c -> (char) c) // преобразуем int в char
                .filter(c -> c == 'е') // фильтруем только 'О' и 'о'
                .count(); // объединяем в строку с разделителем ", "

        System.out.println("Количество букв 'е' в строке " + cnt);
    }


}
