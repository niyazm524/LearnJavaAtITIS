package ml.bimdev.lesson29;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class AaDSTasks {
    public static void main(String[] args) {
        String[] arr = ("10 20 30\n" +
                "7 30 00\n" +
                "23 59 59\n" +
                "13 30 30").split("\\n");

        System.out.println(Arrays.toString(timeTask(arr)));
    }

    static String[] timeTask(String[] array) {
        return Arrays.stream(array)
                .map(str -> str.split(" "))
                .mapToInt(time -> Integer.valueOf(time[0]) * 3600 +
                        Integer.valueOf(time[1]) * 60 +
                        Integer.valueOf(time[2]))
                .sorted()
                .mapToObj(seconds -> {
                    int hours = seconds / 3600;
                    int minutes = seconds % 3600 / 60;
                    int sec = seconds % 3600 % 60;
                    return String.format("%s %s %s", hours, minutes, sec);
                })
                .toArray(String[]::new);
    }
}
