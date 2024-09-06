import java.util.Arrays;

public class FifthPrintLesson {
    public static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void printFirst() {
        for (int i = 0; i < array.length; i++) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            array = newArray;
        }
    }


}