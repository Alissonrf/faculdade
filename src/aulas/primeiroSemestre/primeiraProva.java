package aulas.primeiroSemestre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class primeiraProva {

    public static void main(String[] args) {

        int primeiroMaior = 0;
        int segundoMaior = 0;

        List<Integer> listaGlobal = Arrays.asList(2, 2, 3, 4, 5, 8, 9, 10, 10, 11, 11, 12, 12, 16, 18, 18, 21, 21, 23, 25);

        List<Integer> primeiraLista = new ArrayList<>();
        List<Integer> segundaLista = new ArrayList<>();

        Collections.shuffle(listaGlobal);

        for(int i = 0; i < 20; i++){
            if(i < 10){
                primeiraLista.add(listaGlobal.get(i));
            }else{
                segundaLista.add(listaGlobal.get(i));
            }
        }

        for(int i = 0; i < 10; i++){
            if(primeiraLista.get(i) > segundaLista.get(i)){
                primeiroMaior++;
            }else if(primeiraLista.get(i) < segundaLista.get(i)){
                segundoMaior++;
            }else{
            }
        }
        System.out.println("O placar foi de "+primeiroMaior +" vs " +segundoMaior);
    }
}
