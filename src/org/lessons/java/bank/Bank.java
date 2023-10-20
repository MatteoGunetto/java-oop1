package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner importo = new Scanner(System.in);

        System.out.print("Benvenuto! Inserisci il tuo nome: ");
        String nomeUtente = importo.nextLine();

        Conto conto = new Conto(nomeUtente);
        System.out.println("Hai creato un conto con successo!");
        System.out.println(conto.getInfoConto());

        while (true) {
            System.out.println("Scegli un'opzione:");
            System.out.println("(1) Versare denaro");
            System.out.println("(2) Prelevare denaro");
            System.out.println("(3) Uscire");

            int scelta = importo.nextInt();

            if (scelta == 1) {
                System.out.print("Quanto vuoi versare?: ");
                double importoVersamento = importo.nextDouble();
                if (conto.versamento(importoVersamento)) {
                    System.out.println("Versamento effettuato con successo.");
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                } else {
                    System.out.println("Errore: l'importo del versamento deve essere positivo.");
                }
            } else if (scelta == 2) {
                System.out.print("Quanto vuoi prelevare?: ");
                double importoPrelievo = importo.nextDouble();
                if (conto.prelievo(importoPrelievo)) {
                    System.out.println("Prelievo effettuato con successo.");
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                } else {
                    System.out.println("Errore: l'importo del prelievo deve essere positivo e non superare il saldo disponibile.");
                }
            } else if (scelta == 3) {
                System.out.println("Grazie alla prossima");
                break;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }
            importo.close();
    }
}
