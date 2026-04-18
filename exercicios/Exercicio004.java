package exercicios;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = ler.nextDouble();

        System.out.print("Segundo número: ");
        double n2 = ler.nextDouble();

        System.out.print("Terceiro número: ");
        double n3 = ler.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Média: %.2f%n", media);

        ler.close();
    }
}