package Exercicios;
import java.util.*;
public class Ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int val1, val2,result;
        result = 0;
        val1 = scan.nextInt();
        val2 = scan.nextInt();

        if(val2 == 0){
            System.out.println("informe novos valores: ");
            val1 = scan.nextInt();
            val2 = scan.nextInt();

            result = val1 / val2;
        }else{
            result = val1 / val2;
        }
        System.out.println(result);

        scan.close();
    }
}
