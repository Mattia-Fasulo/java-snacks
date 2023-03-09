package org.snacks.java;

import java.util.Random;

public class Snack4 {
    public static void main(String[] args) {
        // creo due array di lunghezze differenti
         int[] array1 = new int[5];
         int[] array2 = new int[10];

         //inserisco la lunghezza dei due array in due variabili
         int lenghtArray1 = array1.length;
         int lenghtArray2 = array2.length;

         //credo un nuovo random per generare numeri casuali
        Random random = new Random();

        //ciclo fino a quando la lunghezza dell'array1 non raggiunge la lunghezza dell'array2 ed ogni volta stampo un numero casuale da 1 a 10
         while (lenghtArray1 < lenghtArray2){
             int randomNumber = random.nextInt(10);
             System.out.println(randomNumber);
             lenghtArray1++;
         }




    }
}
