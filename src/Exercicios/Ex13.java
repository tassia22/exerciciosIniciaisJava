package Exercicios;
import java.util.*;
public class Ex13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.println("tabuada de"+i+":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }


        scan.close();
    }
}
