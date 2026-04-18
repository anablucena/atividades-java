package exercicios;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        System.out.println("Resultado: " + soma);

        entrada.close();
    }
}