package Exercicios;

import java.util.*;
public class Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double base, altura, area;
        base = scan.nextInt();
        altura = scan.nextDouble();

        area = base * altura;
        System.out.printf("%.2f\n",area);


        scan.close();
    }
}
