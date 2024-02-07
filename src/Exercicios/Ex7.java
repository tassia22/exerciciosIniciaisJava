package Exercicios;
import java.util.*;
public class Ex7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double salarioFixo, valVendas, totalVendas;
        totalVendas = 0.0;
        salarioFixo = scan.nextDouble();
        valVendas = scan.nextDouble();

        if(valVendas <= 1.500){
            totalVendas = salarioFixo + valVendas * 0.3;
        } else if (valVendas > 1.500) {

            totalVendas = salarioFixo + valVendas * 0.5;
        }

        System.out.printf("salario total: %.2f\n",totalVendas);


        scan.close();
    }
}
