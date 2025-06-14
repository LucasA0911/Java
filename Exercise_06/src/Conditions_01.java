//Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles

import java.util.Scanner;

public class Conditions_01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite outro número: ");
        int b = Integer.parseInt(scanner.nextLine());

        int max = Integer.max(a,b);

        System.out.println(max);
    }
}