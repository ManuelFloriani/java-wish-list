package org.lessons.java.presents;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

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

        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter("./resources/listaRegali.txt", true);

            for (int i = 0; i < gifts.size(); i++) {
                fileWriter.write("Regalo");
                fileWriter.write("\nDescrizione: " + gifts.get(i).getDescription());
                fileWriter.write("\nDestinatario: " + gifts.get(i).getReceiver() + "\n \n");
            }
        }
        catch (IOException e) {
            System.out.println("Impossibile scrivere sul file.");
        }
        finally {
            try {
                if (fileWriter != null) {
                    System.out.println("Chiudo il file.");
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        Scanner fileReader = null;
        try {

            fileReader = new Scanner(new File("./resources/data.txt"));

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
