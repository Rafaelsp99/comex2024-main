package br.com.alura.comex.testes;

import java.util.Scanner;

public class testeUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


            do   {
            System.out.print("Digite um número: ");

            if (entrada.hasNextInt()) {
                int numero = entrada.nextInt();

                System.out.println("Parabens o Número digitado foi: " + numero);

                break;

            } else {
                System.out.println("Você digitou: "+ " -> " + entrada.next() + " <- " + " Não digite letras, você deve digitar apenas números.");
                entrada.next();
            }

        } while (true);

    }
}




