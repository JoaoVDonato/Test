package ProjetosProprios.JonBank;

import javax.sound.midi.Soundbank;

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(int valor) {
        if(valor == 0) {
            System.out.println("Não é possível depositar");
        return false;
        } else {
            this.saldo += valor;
        }return true;

    }

    public boolean sacar(int valor) {
        if(valor < getSaldo()) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Não é possível sacar");
            return false;

        }

    }
    public double consulta() {
        return this.saldo;
    }


}
