package com.example.slider5;

public class DescontoClienteRegular implements DescontoStragegy {
    @Override
    public double calcularDesconto(double consumo) {

        if (consumo > 1000) {
            return consumo * 0.05;
        } else {
            return consumo * 0.02;
        }

    }

}
