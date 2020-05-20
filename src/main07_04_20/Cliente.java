
package main07_04_20;

public class Cliente {
    
    private String nome;
    private String telefone;
    private int cpf;

    public Cliente() {
    }
    
    public Cliente(String nome, String telefone, int cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
 
    public int  mostraCpf(){
        
        return this.cpf;
    }
    
}
