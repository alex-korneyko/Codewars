package ua.in.transceptor;

/**
 * Created by Alex Korneyko on 01.07.2016.
 */
public class LargestDifference {

    public static int largestDifference(int[] data) {

        int result = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] <= data[j] && result < j - i) {
                    result = j - i;
                }
            }
        }

        return result;

    }
}
