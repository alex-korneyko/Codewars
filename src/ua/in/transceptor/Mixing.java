package ua.in.transceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Alex Korneyko on 01.07.2016.
 */
public class Mixing {

    public static String mix(String s1, String s2) {

        List<StringElement> stringElements = new ArrayList<>();

        fillStringElementsSet(s1, 1, stringElements);
        fillStringElementsSet(s2, 2, stringElements);

        stringElements.removeIf(element -> element.count == 1);

        cleanDuplicates(stringElements);

        sortStringElementsSet(stringElements);

        return stringBuild(stringElements);
    }

    private static String stringBuild(List<StringElement> stringElements) {

        StringBuilder result = new StringBuilder();

        for (StringElement element : stringElements) {

            if (result.length() > 0) result.append('/');

            result.append(element.stringNumb == 3 ? "=" : element.stringNumb).append(":");

            IntStream.range(0, element.count).forEach(i -> result.append(element.chr));
        }

        return result.toString();
    }

    private static void sortStringElementsSet(List<StringElement> stringElements) {

        stringElements.sort((o1, o2) -> {
            if (o1.count > o2.count) return -1;
            if (o1.count < o2.count) return 1;
            if (o1.count == o2.count) {
                if (o1.stringNumb < o2.stringNumb) return -1;
                if (o1.stringNumb > o2.stringNumb) return 1;
                if (o1.stringNumb == o2.stringNumb) {
                    if (o1.chr < o2.chr) return -1;
                    if (o1.chr > o2.chr) return 1;
                }
            }

            return 0;
        });
    }

    private static void fillStringElementsSet(String string, int stringNumb, List<StringElement> stringElements) {
        for (char chr : string.toCharArray()) {
            boolean newElement = true;

            if (chr < 'a' || chr > 'z') {
                continue;
            }

            for (StringElement stringElement : stringElements) {
                if (stringElement.stringNumb != stringNumb)
                    continue;

                if (stringElement.chr == chr) {
                    stringElement.count++;
                    newElement = false;
                    break;
                }
            }

            if (newElement) {
                stringElements.add(new StringElement(chr, 1, stringNumb));
            }
        }
    }

    private static void cleanDuplicates(List<StringElement> stringElements) {

        int stringElementsDynamicSize = stringElements.size();

        for (int i = 0; i < stringElementsDynamicSize - 1; i++) {

            for (int j = i + 1; j < stringElementsDynamicSize; j++) {
                if (stringElements.get(i).chr == stringElements.get(j).chr) {
                    if (stringElements.get(i).count > stringElements.get(j).count) {
                        stringElements.remove(j);
                        stringElementsDynamicSize--;
                        break;
                    }
                    if (stringElements.get(i).count < stringElements.get(j).count) {
                        stringElements.get(i).count = stringElements.get(j).count;
                        stringElements.get(i).stringNumb = 2;
                        stringElements.remove(j);
                        stringElementsDynamicSize--;
                        break;
                    }
                    if (stringElements.get(i).count == stringElements.get(j).count) {
                        stringElements.get(i).stringNumb = 3;
                        stringElements.remove(j);
                        stringElementsDynamicSize--;
                    }
                }
            }
        }
    }

    static class StringElement {

        public char chr;
        public int count;
        public int stringNumb;

        public StringElement(char chr, int count, int stringNumb) {
            this.chr = chr;
            this.count = count;
            this.stringNumb = stringNumb;
        }
    }
}
