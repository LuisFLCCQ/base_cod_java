/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Exercicio29_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int[] vetB = new int [vetA.length];
        int[] vetC = new int [vetA.length * 2];
        
        for (int i = 0; i < vetA.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetA[i] = (int) (Math.random() * 20);
            
            vetC[i] = vetA[i];
        }
        
        for (int i = 0; i < vetB.length; i++){
            //System.out.printf("Entre com número da posição A(%d):",i+1);
            vetB[i] = (int) (Math.random() * 20);
            
            vetC[vetA.length + i] = vetB[i];
        }

        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor B: ");
        for (int i : vetB) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.print("Vetor C: ");
        for (int i : vetC) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
    }
}
