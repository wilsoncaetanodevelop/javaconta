package main07_04_20;

public class Conta {

    private int agencia;
    private String contaCorrente;
    private float saldo;


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
   
    
    public void depositar(float valor) {
        
      this.saldo = saldo + valor;
    }

    public float saldo() {
        
       return this.saldo;
    }
}
