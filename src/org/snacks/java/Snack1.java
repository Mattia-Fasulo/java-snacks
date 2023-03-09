package org.snacks.java;

import java.util.Scanner;

public class Snack1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        //faccio inserire un numero all'utente
        System.out.print("Inserisci un numero: ");
        num = Integer.parseInt(scanner.nextLine());

        System.out.println();

        if (num % 2 == 0) { // se il numero è pari lo stampo
            System.out.println(num);
        } else { //altrimenti incremento il numero di uno e lo stampo
            num++;
            System.out.println(num);
        }

        scanner.close();

    }

}
