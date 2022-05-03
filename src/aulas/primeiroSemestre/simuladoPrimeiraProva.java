package aulas.primeiroSemestre;

import java.util.Random;

public class simuladoPrimeiraProva {

    public static void main(String[] args) {

        Random random = new Random();
        int listaGlobal[] = new int[] {2, 2, 3, 4, 5, 7, 7, 8, 8, 9};
        int primeiroMaior = 0, segundoMaior = 0;
        int primeiraLista[] = new int[5], segundaLista[]  = new int[5];

        for(int i = 0; i < 10; i++){
            if(i < 5){
                primeiraLista[i] = listaGlobal[random.nextInt(10)];
            }else{
                segundaLista[i - 5] = listaGlobal[random.nextInt(10)];
            }
        }
        for(int i = 0; i < 5; i++){
            if(primeiraLista[i] > segundaLista[i]){
                primeiroMaior++;
            }else{
                segundoMaior++;
            }
        }
        System.out.println("O placar foi de "+primeiroMaior +" vs " +segundoMaior);
    }
}
