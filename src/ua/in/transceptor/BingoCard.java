package ua.in.transceptor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex Korneyko on 10.07.2016.
 */
public class BingoCard {

    public static String[] getCard() {
        String lottery = "BINGO";
        int categoryWidth = 14;
        int categoryStartValue = 1;
        int indexMainArray = 0;
        String[] result = new String[24];

        for (char column : lottery.toCharArray()) {
            int[] category = getCategory(categoryStartValue, categoryWidth, column == 'N' ? 4 : 5);
            for (int i = 0; i < category.length; i++) {
                result[indexMainArray + i] = String.valueOf(column) + category[i];
            }
            indexMainArray += category.length;
            categoryStartValue += categoryWidth + 1;
        }

        return result;
    }

    private static int[] getCategory(int initCategory, int categoryWidth, int categoryLength) {

        int[] result = new int[categoryLength];
        Set<Integer> set = new HashSet<>();
        while (set.size() < categoryLength) {
            final int number = (int) ((initCategory) + Math.random() * categoryWidth);
            if (set.add(number)) {
                result[set.size() - 1] = number;
            }
        }

        return result;
    }

}
