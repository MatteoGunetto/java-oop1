package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("tappetino", "tappetino mouse", 10.0, 22);
        Prodotto prodotto2 = new Prodotto("tastiera", "tastiera meccanica", 15.0, 10);
        Prodotto prodotto3 = new Prodotto("mouse", "mouse gaming", 20.0, 15);

        System.out.println("Prodotto 1:");
        System.out.println("Codice: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo: " + prodotto1.getPrezzo());
        System.out.println("IVA: " + prodotto1.getIva());
        System.out.println("Prezzo con iva: "+prodotto1.getPrezzoConIva());

        System.out.println("Prodotto 2:");
        System.out.println("Codice: " + prodotto2.getCodice());
        System.out.println("Nome: " + prodotto2.getNome());
        System.out.println("Descrizione: " + prodotto2.getDescrizione());
        System.out.println("Prezzo: " + prodotto2.getPrezzo());
        System.out.println("IVA: " + prodotto2.getIva());
        System.out.println("Prezzo con iva: "+prodotto2.getPrezzoConIva());

        System.out.println("Prodotto 3:");
        System.out.println("Codice: " + prodotto3.getCodice());
        System.out.println("Nome: " + prodotto3.getNome());
        System.out.println("Descrizione: " + prodotto3.getDescrizione());
        System.out.println("Prezzo: " + prodotto3.getPrezzo());
        System.out.println("IVA: " + prodotto3.getIva());
        System.out.println("Prezzo con iva: "+prodotto3.getPrezzoConIva());
    }
}