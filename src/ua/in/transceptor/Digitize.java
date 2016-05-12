package ua.in.transceptor;

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

        int[] result = new int[Long.toString(n).length()];

        for(int i=0; i<result.length; i++){
            result[i] = (int) n%10;
            n/=10;
        }

        return result;
    }
}
