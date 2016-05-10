package ua.in.transceptor;

/**
 * 7 kyu
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * <p>
 * Example:
 * <p>
 * HighAndLow("1 2 3 4 5") // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 * <p>
 * Notes:
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 * <p>
 * http://www.codewars.com/
 * <p>
 *
 * @author Alex Korneyko on 10.05.2016.
 */
public class HighestAndLowest {
    public static String HighAndLow(String numbers) {

        String[] numberSet = numbers.split(" ");
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (String sNumber : numberSet) {
            int number = Integer.parseInt(sNumber);

            if (number > maxNumber) maxNumber = number;

            if (number < minNumber) minNumber = number;
        }

        return maxNumber + " " + minNumber;
    }
}
