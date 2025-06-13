//02 - Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.

public class Exercise_05{
    public static void main(String[] args){
        int[][] matriz = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0;i< 10;i++) {
            for (int j = 0; j <  10; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}