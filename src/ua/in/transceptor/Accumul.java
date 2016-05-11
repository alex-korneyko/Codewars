package ua.in.transceptor;

/**
 * Description:
 * <p>
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * <p>
 * accum("abcd") --> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") --> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") --> "C-Ww-Aaa-Tttt"
 * <p>
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 * <p>
 * http://www.codewars.com/
 * <p>
 * Created by Alex Korneyko on 11.05.2016.
 */
public class Accumul {
    public static String accum(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < (i + 1); j++) {
                if (j == 0) {
                    result.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    result.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            if (i != s.length() - 1) {
                result.append('-');
            }
        }
        return result.toString();
    }
}
