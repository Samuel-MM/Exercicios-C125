package br.inatel.cdg;

import br.inatel.cdg.filhos.FilhoDois;
import br.inatel.cdg.filhos.FilhoTres;
import br.inatel.cdg.filhos.FilhoUm;
import br.inatel.cdg.pai.SeuTipo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List <String> listaNomes = new ArrayList<String>();
        List <SeuTipo> lista = new ArrayList<SeuTipo>();

        for (int i = 1; i <= 6; i++){
            System.out.println("Entre com o nome " + i);
            listaNomes.add(entrada.nextLine());
        }

        lista.add(new FilhoUm(listaNomes.get(0), new Random().nextDouble() * 100));
        lista.add(new FilhoUm(listaNomes.get(1), new Random().nextDouble() * 100));

        lista.add(new FilhoDois(listaNomes.get(2), new Random().nextDouble() * 100));
        lista.add(new FilhoDois(listaNomes.get(3), new Random().nextDouble() * 100));

        lista.add(new FilhoTres(listaNomes.get(4), new Random().nextDouble() * 100));
        lista.add(new FilhoTres(listaNomes.get(5), new Random().nextDouble() * 100));

        System.out.println("Lista sem ordenação: ");
        for(SeuTipo item : lista){
            item.getInfo();
        }

        Collections.sort(lista);

        System.out.println("Lista com ordenação decrescente");
        for(SeuTipo itemOrdenado : lista){
            itemOrdenado.getInfo();
        }


        entrada.close();
    }
}
