package com.mycompany.contabanco;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int agencia = 0;
        int numeroConta = 0;
        String nomeCliente = "";
        double saldo = 0;
        
        System.out.println("Por favor, digite o numero da Agencia.");
        agencia = entrada.nextInt();

        System.out.println("Digite o numero da conta.");
        numeroConta = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Digite seu nome.");
        nomeCliente = entrada.nextLine();
        
        System.out.println("Digite seu saldo");
        saldo = entrada.nextDouble();
        
        
        System.out.printf("Ola "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia e "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" ja esta disponivel para saque");
                 
    }
}
