package ua.in.transceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Korneyko on 03.07.2016.
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        List<Character> str1chars = new ArrayList<>();
        for (char chr : str1.toCharArray()) {
            str1chars.add(chr);
        }

        for (char chr : str2.toCharArray()) {
            int index = str1chars.indexOf(chr);
            if(index == -1) {
                return false;
            } else {
                str1chars.remove(index);
            }
        }

        return true;
    }
}
