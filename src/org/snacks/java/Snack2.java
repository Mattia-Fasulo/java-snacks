package org.snacks.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        //Creo due array, uno per i nomi e uno per i cognomi
        String[] names = {"Mattia", "Francesco", "Costanza", "Nina", "Giovanni", "Luca", "Edoardo", "Isabella", "Gemma", "Leonardo"};
        String[] surnames = {"Rossi", "Rici", "Esposito", "Medici", "Pazzi", "Orsini", "Galeazzi", "Sforza"};

        //creo una lista di 10 invitati generando ad ogni ciclo un nome (preso casualmente dall'array dei nomi) e un cognome (preso casualmente dall'array dei cognomi)
        for (int i = 0; i < 10; i++){
            String randomName = getRandomElement(names);
            String randomSurname = getRandomElement(surnames);
            System.out.println(randomName + " " + randomSurname);
        }

    }

    //metodo che genera un indice casuale in base alla lunghezza dell'array che gli viene passato e poi restituisci l'elemento dell'array che occupa la posizione dell'indice appena generato
    public static String getRandomElement(String[] arr) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);
        return arr[randomIndex];
    }
}
