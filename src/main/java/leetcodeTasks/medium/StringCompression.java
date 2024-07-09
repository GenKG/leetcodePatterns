package leetcodeTasks.medium;

//https://leetcode.com/problems/string-compression/description/
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(anotherCompress("aaaabbbccc"));
    }

    public static int compress(char[] chars) {
        int firstP = 0;
        int secondP = 0;
        int count = 0;
        int trackCount = 0;
        while (secondP < chars.length) {
            //Двигаем указатель и считаем буквы пока не столкнемся с другой
            while (secondP < chars.length && chars[firstP] == chars[secondP]) {
                count++;
                secondP++;
            }
            trackCount++;
            //Ставим указатель 1 на место указателя 2
            firstP = secondP;
            //Если насчитали больше 1(надо вставлять цифры в массив)
            if (count > 1) {
                String strCount = String.valueOf(count);
                //Идем по всем цифрам в числе(123 -> 1,2,3)
                for (Character charNumber : strCount.toCharArray()) {
                    chars[trackCount] = charNumber;
                    trackCount++;
                }
            }
            //Меняем последний символ после цифры на следующую букву(a4abbbb) -> (a4bbbbb)
            if (secondP != chars.length) {
                chars[trackCount] = chars[secondP];
            }
            count = 0;

        }
        return trackCount;
    }

    public static String anotherCompress(String str) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = str.toCharArray();

        char firstP = charArray[0];

        char secondP;

        int countSymbol = 1;
        for (int i = 1; i < charArray.length; i++) {

            secondP = charArray[i];
            if (firstP != secondP) {

                if (countSymbol == 1) {
                    builder.append(firstP);
                } else {
                    builder.append(firstP).append(countSymbol);
                }

                countSymbol = 0;

                firstP = secondP;
            }
            if (i == charArray.length - 1) {
                countSymbol++;
                if (countSymbol == 1) {
                    builder.append(firstP);
                } else {
                    builder.append(firstP).append(countSymbol);
                }
            }
            countSymbol++;
        }
        return builder.toString();
    }
}
