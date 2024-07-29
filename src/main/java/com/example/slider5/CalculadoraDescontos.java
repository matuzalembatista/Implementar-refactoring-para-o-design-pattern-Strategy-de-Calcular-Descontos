package com.example.slider5;

public class CalculadoraDescontos {

    private DescontoStrategy descontoStrategy;

    // Método para definir a estratégia de desconto
    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    // Método para calcular o desconto
    public double calcularDesconto(double consumo, String tipoCliente) {
        switch (tipoCliente.toLowerCase()) { // Normaliza a entrada para evitar problemas de case sensitivity
            case "regular":
                setDescontoStrategy(new DescontoClienteRegular());
                break;
            case "vip":
                setDescontoStrategy(new DescontoClienteVIP());
                break;
            case "funcionario":
                setDescontoStrategy(new DescontoFuncionario());
                break;
            default:
                return 0; // Caso o tipo de cliente não seja reconhecido
        }

        // Verifica se a estratégia de desconto foi definida
        if (descontoStrategy == null) {
            return 0;
        }

        // Calcula e retorna o desconto usando a estratégia definida
        return descontoStrategy.calcularDesconto(consumo);
    }
}
