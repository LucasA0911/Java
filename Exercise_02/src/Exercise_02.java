import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_02 {
    public static double media1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numeros.size() == 3){
                break;
            }
        }
        int sum = 0;
        int i;
        for(i = 0; i < numeros.size(); i++) {
            sum = sum + numeros.get(i);
        }
        double media = sum/3;
        System.out.println("A média é: " + media);
        return media;
    }
    public static void main(String[] args){
        ArrayList<Double> soma = new ArrayList();
        while(soma.size() < 2){
            soma.add(media1());
        }
        int sum = 0;
        int i;
        for(i = 0; i<soma.size(); i++){
            sum += soma.get(i);
        }
        System.out.println("A soma das duas médias é: " + sum);
    }
}
