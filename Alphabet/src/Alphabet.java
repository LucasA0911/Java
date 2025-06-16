import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet{

    public static boolean isANumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> vogal = new ArrayList();
        vogal.add("A");
        vogal.add("E");
        vogal.add("I");
        vogal.add("O");
        vogal.add("U");

        while(true){
            System.out.print("Insira uma letra para conferir se é vogal ou consoante: ");
            String letra = scanner.nextLine();

            if(isANumber(letra) == false){
                for(int i = 0; i < letra.length();i++){
                    if(letra.equalsIgnoreCase(vogal.get(i))){
                        System.out.println("A letra inserida é uma vogal");
                    }
                    else{
                        System.out.println("A letra é uma consoante.");
                    }
                }
                break;
            }else{
                System.out.println("Insira uma letra e não um número.");
                continue;
            }

        }
    }
}