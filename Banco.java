package ProjetosProprios.JonBank;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        int menu1;
//        do {
//            System.out.println("Olá, selecione a opção para prosseguir");
//            System.out.println("[1] Cadastrar");
//            System.out.println("[2] Logar");
//            menu1 = entrada.nextInt();
//
//            switch (menu1) {
//                case 1: {
//                    Clientes c1 = new Clientes();
//                    Cadastro cadastro = new Cadastro();
//                    System.out.println("Digite seu nome");
//                    cadastro.setNome(entrada.next());
//                    System.out.println("Digite uma senha de 4 dígitos");
//                    cadastro.setSenha(entrada.nextInt());
//                    if (c1.salvar(cadastro)) {
//                        System.out.println("Cliente cadastrado com sucesso");
//                    } else {
//                        System.out.println("Erro ao cadastrar");
//                        break;
//                    }
//                }
//                case 2: {
//                    Clientes c1 = new Clientes();
//                    Login login = new Login();
//                    Cadastro cadastro = new Cadastro();
//                    System.out.println("Digite seu nome");
//                    login.setNome(entrada.next());
//                    System.out.println("Digite uma senha de 4 dígitos");
//                    login.setSenha(entrada.nextInt());
//                    if (login.equals(cadastro)) {
//                        System.out.println("Login realizado. seja bem vindo ao Jon Bank");
//                    } else {
//                        System.out.println("Ocorreu algum erro");
//                    }
//                }
//            }
//        } while (menu1 == 1);

        int sair;

        do {
            System.out.println("[1] Consultar  ");
            System.out.println("[2] Sacar");
            System.out.println("[3] Depositar");
            int menu2 = entrada.nextInt();

            switch (menu2) {
                case 1: {
                    Conta conta = new Conta();
                    System.out.println(conta.consulta());
                    break;
                }
                case 2: {
                    Conta conta = new Conta();
                    conta.sacar(entrada.nextInt());
                    conta.getSaldo();
                    break;
                }
                case 3: {
                    Conta conta = new Conta();
                    conta.depositar(entrada.nextInt());
                    conta.getSaldo();
                    break;
                }


            }
            System.out.println("Para Sair aperte 0, para continuar qualquer outra tecla");
            sair = entrada.nextInt();
        }
            while (sair != 0);
            System.out.println("Obrigado");


            entrada.close();
    }





    }










