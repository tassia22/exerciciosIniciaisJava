package Exercicios;
import java.util.*;
public class Ex8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qntdAtual, qntdMax, qntdMin, qntdMedia;
        qntdAtual = scan.nextInt();
        qntdMax = scan.nextInt();
        qntdMin = scan.nextInt();

        qntdMedia = (qntdMax + qntdMin)/2;
        if(qntdAtual >= qntdMedia){
            System.out.println("nao efetuar compra");

        }else{
            System.out.println(" efetuar compra");

        }

        scan.close();
    }
}
