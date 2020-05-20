
package main07_04_20;

public class ContaPoupanca extends Conta {
    
    private int diaDeposito;
    private Cliente pessoa;

    public int getDiaDeposito() {
        return diaDeposito;
    }

    public void setDiaDeposito(int diaDeposito) {
        this.diaDeposito = diaDeposito;
    }

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }
    
   
    public float verLucro(){
        
        if(diaDeposito!=0){
            return (saldo()*diaDeposito * 0.05f);
        }
        else{
            return 0;
        }
    }
    
    
}
