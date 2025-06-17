package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Aluno;
import com.guilherme.tesch.modelos.Vetor;

public class VetorTeste {
    public static void main(String[] args){
        //testando metodo adiciona
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
        //Serão 100 null´s, então o metodo "adiciona" esta funcionando. A ideia e percorrer t'odo o array e, assim que encontrar uma posição nula, o aluno da vez é armazenado nela.
    }
}
