/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author cauaa
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ola! Bem-vindo ao nosso sistema bancario!");
        System.out.println("Por favor, digite o seu nome !");
        String nome = scn.nextLine();

        System.out.println("Por favor, digite o numero da Agencia !");
        String agencia = scn.nextLine();

        System.out.println("Por favor, digite o numero da conta !");
        int numero = scn.nextInt();

        System.out.println("Por favor, digite o total do seu saldo !");
        float saldo = scn.nextFloat();

        System.out.printf("%s, obrigado por criar uma conta em nosso banco, sua agencia %s, sua conta %s e seu saldo %.2f ja esta disponível para saque", nome, agencia, numero, saldo);
        scn.close();
    }
}
