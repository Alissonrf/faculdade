package aulas;

import java.util.Scanner;

public class exercicioWhile {

    public static void main(String[] args) {

        int n, num, i, j, fat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que serao lidos: ");
        n = scanner.nextInt();
        i = 1;
        while(i <= n){
            System.out.println("Digite o "+i+" numero: ");
            num = scanner.nextInt();
            fat = 1;
            j = 1;
            while(j <= num){
                fat = fat * j;
                j++;
            }
            System.out.println("Fatorial de "+num+" = "+fat);
            i++;
        }
    }
}
