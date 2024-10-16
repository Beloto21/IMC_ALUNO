package utilidades;

public class FuncoesUteis {
	
    // metodo que verifica se o CPF tem 11 digitos
    public static boolean verificarCpf(String cpf) {
        return cpf != null && cpf.length() == 11;
    }

    // metodo para calcular o IMC da pessoa e exibir a classificaçao
    public static String calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura precisa ser maior que zero.");
        }
        
        double imc = peso / (altura * altura);
        String classificacao;

        // classificaçao da tabela do IMC
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } 
        else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } 
        else if (imc >= 25 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } 
        else if (imc >= 30 && imc < 34.9) {
            classificacao = "Obesidade grau 1";
        } 
        else if (imc >= 35 && imc < 39.9) {
            classificacao = "Obesidade grau 2";
        } 
        else {
            classificacao = "Obesidade grau 3 (Obesidade mórbida)";
        }

        // retorna o IMC calculado e a classificaçao 
        return String.format("IMC: %.2f (%s)", imc, classificacao);
    }

    // metodo que avalia o aluno
    public static String avaliarAluno(double nota, double percentualPresenca) {
        if (nota >= 5 && percentualPresenca >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}