package com.example.slider5;

public class CalculadoraDescontos {
    public double calcularDesconto(double consumo, String tipoCliente) {
        if (tipoCliente.equals("Regular")) {
            if (consumo > 1000) {
                return consumo * 0.05;
            } else {
                return consumo * 0.02;
            }
        } else if (tipoCliente.equals("VIP")) {
            if (consumo > 1000) {
                return consumo * 0.10;
            } else {
                return consumo * 0.05;
            }
        } else if (tipoCliente.equals("Funcionario")) { 
            return consumo * 0.30;
        } else {
            return 0;
        }
    }
}
