package Exercicios;
import java.util.*;
public class Ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double custoCarroNovo, custoFabrica;

        System.out.println("informe o custo de fabrica");
        custoFabrica = scan.nextDouble();

        custoCarroNovo = custoFabrica * 1.28 * 1.48;

        System.out.printf("o custo do carro sera: %.2f",custoCarroNovo);

        scan.close();
    }
}
