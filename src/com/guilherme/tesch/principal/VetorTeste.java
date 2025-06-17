package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Aluno;
import com.guilherme.tesch.modelos.Vetor;

public class VetorTeste {
    public static void main(String[] args){
        //testando metodo adiciona
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("Danilo");

        Vetor lista = new Vetor();

        System.out.println(lista);
        //Serão 100 null´s, então o metodo "adiciona" esta funcionando. A ideia e percorrer t'odo o array e, assim que encontrar uma posição nula, o aluno da vez é armazenado nela.

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);

        System.out.println(lista.tamanho());
        System.out.println(lista.contem(a1));

        System.out.println(lista.contem(a3));

        Aluno x = lista.pega(300);
        System.out.println(x);
    }
}
