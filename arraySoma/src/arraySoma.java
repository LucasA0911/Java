//Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor.
// Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.
import java.util.ArrayList;
import java.util.Scanner;

public class arraySoma{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList();

        while(true){ // looping para adicionar os números no array
            System.out.print("Digite o número a ser inserido no array: ");
            String numero = scanner.nextLine(); // armazena o número digitado no console na variável
            if(eUmInteiro(numero) == true) {//verifica se é um número inteiro
                int numeroInt = Integer.parseInt(numero); // passa o número para o formato Int
                numeros.add(numeroInt); // adiciona o número no array
                if(numeros.size() < 12){ // verifica se ainda tem espaço no array que está limitado em 12
                    continue;// retorna na solicitação de número se ainda tiver espaço
                }
                else{
                    break; // para o looping se não tiver mais espaço
                }
            }
            else{
                System.out.println("Insira um valor númerico");
                continue; // caso o valor inserido não seja um inteiro, ele retorna para o inicio do looping
            }
        }
        while(true) {
            System.out.printf("Dentre os números da lista: %s, digite o primeiro número que você quer somar: ", numeros.toString());
            String index1 = scanner.nextLine(); // recebe o primeiro valor a ser somado

            System.out.printf("Dentre os números da lista: %s, digite o segundo número que você quer somar: ", numeros.toString());
            String index2 = scanner.nextLine(); // recebe o segundo valor a ser somado

            if(eUmInteiro(index1) == true && eUmInteiro(index2) == true){ // valida se é um número inteiro
                int i1 = Integer.parseInt(index1); // transforma String em Int
                int i2 = Integer.parseInt(index2);// Transforma String em Int
                int a = 0; // recebendo valor vazio a ser transformado
                int b = 0;

                for(int i = 0 ;i < numeros.size();i++) { // faz a iteração no array para verificar a posição que o numero escolhido está
                    if (numeros.get(i) == i1) { // verifica se o número no array e o escolhido é o mesmo
                        a = numeros.get(i); // pega o número escolhido do array para somar
                    }
                }
                for(int j = 0 ;j < numeros.size(); j++){ // o mesmo só que com o segundo número
                    if(numeros.get(j) == i2){
                        b = numeros.get(j);
                    }
                }
                if(a == i1 && b == i2){ // caso os números sejam os mesmos ele soma
                    System.out.printf("A soma do número %d e o número %d é: %d %n", a, b, soma(a,b));
                    break;
                }
                else{ // caso não seja ele pede para colocar um dos números que está no array.
                    System.out.println("Um dos números digitados não está na lista.");
                    continue;
                }
            }
            else{ // caso o número não seja um inteiro, ele retorna a mensagem:
                System.out.println("Digite um número inteiro válido.");
                continue;
            }

        }
    }

    public static boolean eUmInteiro(String str){ // garante que nenhuma string, double ou float passe sem querer.
        try {
            Integer.parseInt(str); // verifica se a string da para virar INT
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int soma(int a, int b){ // método de soma
        int soma = a+b;
        return soma;
    }
}