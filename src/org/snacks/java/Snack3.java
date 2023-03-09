package org.snacks.java;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        //questo è il mio array di numeri
        int[] array = {1,0,5,0,8,0,9,0};

        //inizializzo una costante per la somma
        int sum = 0;

        //ciclo sulla lunghezza dell'array
        for (int i = 0; i < array.length; i++){

            //controllo se l'indice è dispari, in quel caso sommo il numero che occupa quella posizione a sum
            if(!(i % 2 == 0)){
                sum += array[i];
            }
        }

        //stampo il contenuto dell'array
        System.out.println("L'array e: " + Arrays.toString(array));

        //stampo il risultato
        System.out.println("La somma dei numeri che accupano una posizione dispari è: " + sum);


    }
}
