package Exercicios;
import java.util.*;
public class Ex10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int qntd;
        double precoUni, total, totalPagar;
        nome = scan.next();
        qntd = scan.nextInt();
        precoUni = scan.nextDouble();

        if(qntd <=5){
            total = qntd * precoUni;
            totalPagar = total - 0.02;

        }
        else if(qntd > 5 && qntd <=10){
            total = qntd * precoUni;
            totalPagar = total - 0.03;

        }
        else{
            total = qntd * precoUni;
            totalPagar = total - 0.05;

        }
        System.out.printf("total: %.2f\n", total);
        System.out.printf("total a pagar: %.2f\n", totalPagar);



        scan.close();
    }

}
