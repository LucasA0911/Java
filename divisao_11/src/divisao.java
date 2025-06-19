//Faça um programa que verifique e mostre os números entre 1.000 e 2.000
// (inclusive) que, quando divididos por 11 produzam resto igual a 2.

public class divisao{
    public static void main(String[] args){
        for(int i = 1000; i < 2000; i++){ // interação de 1000 a 2000
            if(i % 11 == 2){ // condição da sobra da divisão
                System.out.println(i); // imprime na tela os números que correspondem a condição
            }
        }
    }
}