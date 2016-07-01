package ua.in.transceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Korneyko on 30.06.2016.
 */
public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> results = new ArrayList<>();

        for (long i = a; i < b; i++) {
            if (i == sumDigPowerResult(i)) {
                results.add(i);
            }
        }

        return results;
    }

    private static long sumDigPowerResult(long value) {

        List<Long> digits = new ArrayList<>();
        long result = 0;

        while (value > 0) {
            digits.add(0, value % 10);
            value /= 10;
        }

        for (int i = 0; i < digits.size(); i++) {
            result = (long) (result + Math.pow(digits.get(i), i + 1));
        }

        return result;
    }
}
