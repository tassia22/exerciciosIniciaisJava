package Exercicios;
import java.util.*;
public class Ex9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if((a < b + c) && (b < a + c) && c < a + b){
            System.out.println("forma um triangulo");
        }else{
            System.out.println("nao forma um triangulo");
        }


        scan.close();
    }
}
