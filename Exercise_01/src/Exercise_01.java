import java.util.Scanner;
// Esse código pode ser melhorado
public class Exercise_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a sua idade? ");
        int age = scanner.nextInt();

        double days = age*365;
        System.out.println(days);
    }
}