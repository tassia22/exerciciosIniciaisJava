package Exercicios;
import java.util.*;
public class Ex5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int valor;
        valor = scan.nextInt();
        if(valor > 10){
            System.out.println("e maior que 10");
        }else{
            System.out.println("nao e maior que 10");
        }


        scan.close();
    }
}
