package org.lessons.java.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String parola = scan.nextLine();
        scan.close();
        Map<Character, Integer> charMap = new HashMap<>();

        for (char carattere : parola.toCharArray()){
            if (Character.isLetter(carattere)){
                carattere = Character.toLowerCase(carattere);
                charMap.put(carattere, charMap.getOrDefault(carattere, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
