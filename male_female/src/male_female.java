import java.util.Scanner;

public class male_female{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Insira o sexo do bebê (M/F): ");
            String sexo = scanner.nextLine();

            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                String resposta = sexo.equals("M") ? "Masculino" : "Feminino";
                System.out.println("Parabéns papai! O sexo do seu bebê é: " + resposta);
                break;
            }
            else{
                System.out.println("Insira apenas M ou F");
                continue;
            }
        }
    }
}