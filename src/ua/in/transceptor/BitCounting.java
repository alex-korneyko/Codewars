package ua.in.transceptor;

/**
 * Created by Alex Korneyko on 01.07.2016.
 */
public class BitCounting {

    public static int countBits(int n) {

        String binRepresentation = "";
        int result = 0;

        while (n > 0) {
            binRepresentation += n % 2;
            n /= 2;
        }

        for (int i = 0; i < binRepresentation.length(); i++) {
            if (binRepresentation.charAt(i) == '1') result++;
        }

        return result;
    }
}
