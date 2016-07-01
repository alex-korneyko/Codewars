package ua.in.transceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Given a non-negative integer, return an array containing a list of independent digits in reverse order.
 * <p>
 * Example:
 * 348597 => [7,9,5,8,4,3]
 * <p>
 * Created by Alex Korneyko on 12.05.2016.
 */
public class Digitize {
    public static int[] digitize(long n) {

        List<Integer> digitsSet = new ArrayList<>(0);
        if(n == 0) return new int[]{0};

        while (n>0){
            digitsSet.add((int) (n%10));
            n/=10;
        }

        int[] result = new int[digitsSet.size()];
        IntStream.range(0, result.length).forEach((i) -> result[i] = digitsSet.get(i));

        return result;
    }
}
