package br.com.aula;

public class CalculadoraIMC {

    public double calcular(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser um valor positivo.");
        }
        double imc = peso / (altura * altura);
        return Math.round(imc * 100.0) / 100.0;
    }

    public String classificar(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}