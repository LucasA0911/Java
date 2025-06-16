import java.util.Scanner;

public class Media {
    public static Double media(double a, double b){
        Double sum = a+b;
        Double media = sum/2;
        return media;
    }

    public static boolean isANumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Insira a primeira nota: ");
            String nota1 = scanner.nextLine();

            System.out.print("Insira a segunda nota: ");
            String nota2 = scanner.nextLine();

            if(isANumber(nota1) == true && isANumber(nota2) == true){

               Double nota1Double = Double.parseDouble(nota1);
               Double nota2Double = Double.parseDouble(nota2);

               if(nota1Double >= 0 && nota1Double <= 10 && nota2Double >= 0 && nota2Double <= 10) {

                   if(media(nota1Double,nota2Double) == 10){
                       System.out.println("Seu aluno foi aprovado com distinção. E a média foi de: " + media(nota1Double, nota2Double));
                       break;
                   }
                   else if(media(nota1Double, nota2Double) >= 7){
                       System.out.println("Seu aluno foi aprovado. E a média foi de: " + media(nota1Double, nota2Double));
                       break;
                   }
                   else{
                       System.out.println("Seu aluno foi reprovado. E a média foi de: " + media(nota1Double, nota2Double));
                       break;
                   }

               }
               else {
                   System.out.println("Insira uma nota de 0 a 10");
                   continue;
               }
            } else{
                System.out.println("Insira um número e não uma letra");
                continue;
            }
        }
    }
}