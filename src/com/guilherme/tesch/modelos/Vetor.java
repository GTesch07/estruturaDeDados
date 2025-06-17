package com.guilherme.tesch.modelos;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }


    public void adiciona(Aluno aluno){
        //recebe um aluno
//        for (int i = 0; i < alunos.length; i++){
//            if (alunos[i] == null){
//                alunos[i] = aluno;
//                break;
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
            }




    public Aluno pega(int posicao){
        //recebe uma posição e devolve o aluno
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
            //Manipula um erro
        }
        return alunos[posicao];
    }



    public void remove(int posicao){
        //remove pela posição
    }

    public boolean contem(Aluno aluno){
        //descobre se o aluno está ou não na lista
        for(int i = 0; i < totalDeAlunos; i++){
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        //Devolve a quantidade de alunos
        return totalDeAlunos;
    }

    public String toString(){
        //Facilitará na impressão
        return Arrays.toString(alunos);
    }
}
