/*
Exercicio :
Faça um programa em JAVA para exibir os números 
ímpares entre 0 e 100. 
 */
package lista7;
import java.util.Scanner;

public class Exercicio1_lista7 {
    public static void main(String[] args) {
        int cont=0;
        while (cont <= 100){ 
            System.out.println(""+cont);
            cont = cont + 3;
        }
    }
}
