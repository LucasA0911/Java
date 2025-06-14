// 2- Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

import java.util.Scanner;

public class positive_negative{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());
        String text;

        if(numero > 0){
            text = "Número natural Positivo";
        }
        else if(numero < 0){
            text = "Número natural Negativo";
        }
        else{
            text = "Número natural Nulo";
        }
        System.out.println(text);
    }
}