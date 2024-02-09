package br.com.alura.comex;

import java.util.Scanner;
import java.util.InputMismatchException;

public class tratandoException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        do {
            try {
            System.out.print("Digite um número: ");

            if (entrada.hasNextInt()) {
                int numero = entrada.nextInt();

                System.out.println("Parabens o Número digitado foi: " + numero);

                break;

            } else {
                System.out.println("Você digitou: "+ " -> " + entrada.next() + " <- " + " Não digite letras, você deve digitar apenas números.");
                entrada.next();


            }
        }  catch (NumberFormatException e) {
            System.out.println("ATENÇÃO ERRO: Você digitou: "+ " -> " + entrada.next() + " <- " + " Não digite letras, você deve digitar apenas números.");
                entrada.next();}

        } while (true);

    }
}




