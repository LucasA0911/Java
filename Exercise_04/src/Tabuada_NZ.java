//01 - Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.

import java.util.Scanner;

public class Tabuada_NZ{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Digite um número inteiro maior que 0 para saber sua taboada: ");
            int numero = Integer.parseInt(scanner.nextLine());

            if(numero > 0){
               int i;
               for(i = 1; i <= 10; i++){
                   int resultado = numero * i;
                   System.out.println(numero + "X" + i + " = " + resultado);
               }
            break;
            }else{
                continue;
            }
        }
    }
}