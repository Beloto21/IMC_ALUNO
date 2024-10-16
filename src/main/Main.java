package main;

import pessoas.Aluno;
import utilidades.FuncoesUteis;

public class Main {
	
    public static void main(String[] args) {
    	
        // criando um objeto aluno
        Aluno aluno = new Aluno("Nicolas Beloto Armenio", "54499778832", 83.0, 1.74, 7.5, 90.0);

        // verificaçao do CPF
        System.out.println("CPF válido? " + FuncoesUteis.verificarCpf(aluno.getCpf()));

        // calculo de IMC com a tabela
        String resultadoIMC = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("Resultado do IMC: " + resultadoIMC);

        //  avaliaçao do aluno
        String resultadoAluno = FuncoesUteis.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Resultado do aluno: " + resultadoAluno);
    }
}