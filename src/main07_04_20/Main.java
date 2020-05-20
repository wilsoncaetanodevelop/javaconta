package main07_04_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void obterDados(ArrayList<ContaPoupanca> dados) {

        Cliente cli = new Cliente();
        ContaPoupanca poupa = new ContaPoupanca();
        
        System.out.print("Digite o cpf: ");
        cli.setCpf(sc.nextInt());

        System.out.print("Digite o nome: ");
        cli.setNome(sc.next());

        System.out.print("Digite o telefone: ");
        cli.setTelefone(sc.next());

        System.out.print("Digite a agencia: ");
        poupa.setAgencia(sc.nextInt());

        System.out.print("Conta Corrente: ");
        poupa.setContaCorrente(sc.next());
        
        poupa.setPessoa(cli);
        dados.add(poupa);
    }

    public static void menu() {

        System.out.println("----Digite----");
        System.out.println("  1_Adiciona Cliente");
        System.out.println("  2_Busca por CPF");
        System.out.println("  3_Depositar");
        System.out.println("  4_sair");
    }

    public static void main(String[] args) {

        ArrayList<ContaPoupanca> banco = new ArrayList<ContaPoupanca>();
        Conta conta = new Conta();
        
        int n;

        do {
            menu();
            System.out.println(" ");
            n = sc.nextInt();

            switch (n) {

                case 1:
                    obterDados(banco);

                    break;

                case 2:
                    System.out.print("Digite o CPF para busca: ");

                    int cpf = sc.nextInt();

                    for (int i = 0; i < banco.size(); i++) {

                        if (banco.get(i).getPessoa().getCpf() == cpf) {

                            System.out.println("Nome: " + banco.get(i).getPessoa().getNome());
                            System.out.println("Telefone: " + banco.get(i).getPessoa().getTelefone());
                            System.out.println("CPF: " + banco.get(i).getPessoa().getCpf());
                            System.out.println("Agencia: " + banco.get(i).getAgencia());
                            System.out.println("Conta Corrente: " + banco.get(i).getContaCorrente());
                            System.out.println("Saldo da Conta: " + banco.get(i).getSaldo());
                            System.out.println("Lucro do juros: " + banco.get(i).verLucro());
                        } else {
                            System.out.println("Cliente não Existente!!! ");
                        }

                    }
                    break;

                case 3:

                    System.out.print("Informe o CPF para Deposito: ");
                    cpf = sc.nextInt();

                    for (int i = 0; i < banco.size(); i++) {

                        if (banco.get(i).getPessoa().getCpf() == cpf) {

                            System.out.print("Qual valor a ser depositado: ");
                            float valor = sc.nextFloat();
                            banco.get(i).depositar(valor);
                            System.out.print("Em qual dia do mes: ");
                            int dia = sc.nextInt();
                            banco.get(i).setDiaDeposito(dia);
                            banco.get(i).getSaldo();

                        } else {
                            System.out.println("Cliente não Existente!!! ");
                        }
                    }

                    break;

            }

        } while (n != 4);
    }

}
