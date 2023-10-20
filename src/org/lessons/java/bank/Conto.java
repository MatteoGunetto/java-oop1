package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private int numeroConto;
    private String proprietario;
    private double saldo;

    public Conto(String proprietario) {
        this.numeroConto = randomConto();
        this.proprietario = proprietario;
        this.saldo = 0.0;
    }

    private int randomConto() {
        Random random = new Random();
        return random.nextInt(1000) + 1; // Numeri casuali da 1 a 1000
    }
    public int getNumeroConto() {
        return numeroConto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean versamento(double importo) {
        if (importo > 0) {
            saldo += importo;
            return true;
        }
        return false;
    }

    public boolean prelievo(double importo) {
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;
            return true;
        }
        return false;
    }

    public String getInfoConto() {
        return "Benvenuto " + proprietario +" " + "Numero Conto: " + numeroConto +" " +  "Saldo: " + getSaldoFormattato();
    }

    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }

}
