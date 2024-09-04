package ru.knyazeva;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.
public class HashTask {
    private static String text = "В моeм аккорде три струны, \n" +
            "Но всех больней звучит вторая \n" +
            "Тоской нездешней стороны, \n" +
            "В моeм аккорде три струны: \n" +
            "В них детства розовые сны, \n" +
            "В них вздох потерянного рая. \n" +
            "В моeм аккорде три струны, \n" +
            "Но всех больней звучит вторая.";


    public static void main(String[] args) {
        String[] arrayWord = text.split(" ");
        Map<String,Integer> textHash = new HashMap<>();
        for(int i = 0; i < arrayWord.length; i++){
            if(textHash.containsKey(arrayWord[i])){
                Integer count = textHash.get(arrayWord[i]);
                textHash.put(arrayWord[i], count + 1);
            }else{
                textHash.put(arrayWord[i],1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = textHash.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
