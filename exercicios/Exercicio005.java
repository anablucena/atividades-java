package exercicios;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Graus Celsius é igual a " + fahrenheit + " Graus Fahrenheit :D ");

        sc.close();
    }
}