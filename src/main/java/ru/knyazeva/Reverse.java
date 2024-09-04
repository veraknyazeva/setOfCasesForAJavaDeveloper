package ru.knyazeva;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        String text = "субстанционализироваться";
        System.out.println(reverse(text));

        int a = 3;
        int b = 5;
        int[] array = change(a,b);
        System.out.println(Arrays.toString(array));

    }

    public static int[] change(int a, int b){
        a = a + b; // a = 8
        b = b - a; // b = -3
        b = -b;    // b = 3
        a = a - b; // a = 5
        int[] array = new int[]{a,b};
        return array;
    }

    public static char[] reverse(String text) {
        char[] arrayText = new char[text.length()];

        for (int j = 0; j < text.length(); j++) {
            arrayText[j] = text.charAt(j);
        }
        System.out.println(Arrays.toString(arrayText));

        for (int i = 0; i < arrayText.length / 2; i++) {
            char tmp = arrayText[i];
            arrayText[i] = arrayText[arrayText.length - 1 - i];
            arrayText[arrayText.length - 1 - i] = tmp;
        }
        return arrayText;
    }


}
