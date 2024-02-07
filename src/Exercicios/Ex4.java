package Exercicios;
import java.util.*;

public class Ex4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int carVendidos;
        double valTotal, salarioFixo, valPorCarroVendido, salarioFinal;

        System.out.println("informe a quantidade de carros vendidos: ");
        carVendidos = scan.nextInt();
        System.out.println("informe o seu salario fixo: ");
        salarioFixo = scan.nextDouble();
        System.out.println("informe o valor total de vendas: ");
        valTotal = scan.nextDouble();
        System.out.println("informe a comissao por carro vendido: ");
        valPorCarroVendido= scan.nextDouble();

        double comissaoTotal;
        double comissaoAdicional;
        comissaoTotal = carVendidos + valPorCarroVendido;
        comissaoAdicional = 0.5 * valTotal;
        salarioFinal = comissaoTotal + salarioFixo + comissaoAdicional;

        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

        scan.close();
    }
}
