package Exercicios;
import java.util.*;
public class Ex6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double qntd, preco;

        System.out.println("informe a quantidade de macas");
        qntd = scan.nextDouble();
        if(qntd < 12){
            preco = qntd * 1.30;
        }else{

            preco = qntd * 1.00;
        }
        System.out.printf("o custo total das macas e: %.2f", preco);


        scan.close();
    }
}
