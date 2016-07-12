package ua.in.transceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Alex Korneyko on 11.07.2016.
 */
public class Max {

    public static int sequence(int[] arr) {

        if (arr.length == 0) return 0;

        List<Integer> allSums = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                List<Integer> subList = new ArrayList<>();
                IntStream.range(i, j).forEach(k -> subList.add(arr[k]));
                allSums.add(subList.stream().mapToInt(Integer::new).sum());
            }
        }

        return allSums.stream().max(Integer::compareTo).get();
    }
}
