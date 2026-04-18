package exercicios;

import java.util.Scanner;

public class Exercicio002 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.println("Oi, " + nome + "!");

        teclado.close();
    }
}