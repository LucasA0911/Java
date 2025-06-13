import java.util.Scanner;

public class Exercise_03 {

    public static double juros(Double saldo){

        double valorJuros = (saldo/100)*1;
        double saldoComJuros = valorJuros + saldo;

        return saldoComJuros;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira aqui o seu saldo: ");
        double saldo = scanner.nextInt();

        double saldoJuros = juros(saldo);

        System.out.println("Seu saldo acrescido de 1% de juros é: R$" + saldoJuros);
    }
}