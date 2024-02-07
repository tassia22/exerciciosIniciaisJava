package Exercicios;
import java.util.*;
public class Ex12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int val;
        val = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            int tabuada;

            tabuada = i * val;

            //System.out.printfln(val + "x"+i+"="+tabuda);
        }


        scan.close();
    }
}
