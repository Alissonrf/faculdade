package aulas;

import java.util.Scanner;

public class exercicioVetor {

    public static void main(String[] args) {

        float valorTotal = 0;
        double salario = 0;
        float precoPeca[] = new float[10];
        int qtdPecasVendidas[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++){
            System.out.println("Digite o valor da peça: "+ i);
            precoPeca[i] = scanner.nextFloat();
            System.out.println("Digite a quantidade de peças vendidas: ");
            qtdPecasVendidas[i] = scanner.nextInt();
            valorTotal += precoPeca[i] * qtdPecasVendidas[i];
        }
        System.out.println("O valor total Vendido é de: " +valorTotal);
        salario = 545 + (valorTotal * 0.05);
        System.out.println("O salário do vendedor é de: " + salario);

    }
}
