package org.lessons.java.presents;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Gift> gifts = new ArrayList<>();

        boolean stop = false;
        while(!stop){
            System.out.println("La tua lista contiene " + gifts.size() + " regali.");
            System.out.println("Inserire un regalo? y/n");
            stop = scan.nextLine().equals("n");
            if (!stop){
                System.out.println("Description: ");
                String description = scan.nextLine();
                System.out.println("Receiver: ");
                String receiver = scan.nextLine();
                gifts.add(new Gift(description, receiver));
            }
        }
        System.out.println(gifts);
        scan.close();
    }
}
