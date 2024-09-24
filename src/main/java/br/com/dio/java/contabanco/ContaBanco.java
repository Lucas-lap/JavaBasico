package br.com.dio.java.contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        // Solicita ao usuário que insira os dados da conta
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Solicita ao usuário que insira os dados da conta
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Conta!");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            
            System.out.println("Por favor, digite o seu Nome!");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o Saldo!");
            double saldo = scanner.nextDouble();
            
            // Exibe a mensagem final com os dados inseridos
            String mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(agencia).concat(", conta ").concat(String.valueOf(numero))
                    .concat(" e seu saldo ").concat(String.valueOf(saldo))
                    .concat(" já está disponível para saque.");
            
            System.out.println(mensagem);
        }
    }
}
