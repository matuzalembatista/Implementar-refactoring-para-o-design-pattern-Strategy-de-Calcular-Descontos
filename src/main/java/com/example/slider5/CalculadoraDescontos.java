package com.example.slider5;

public class CalculadoraDescontos {

    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
        

    public double calculadoraDescontos(double consumo, String tipoCliente) {
        switch (tipoCliente) {
            case "Regular || 1":
                setDescontoStrategy(new DescontoClienteRegular());
                break;
            case "VIP || 2":
                setDescontoStrategy(new DescontoClienteVIP());
                break;
            case "Funcionario || 3":
                setDescontoStrategy(new DescontoFuncionario());
                break;
            default:
                return 0;
        }
        return descontoStrategy.calcularDesconto(consumo);
    }
   
}

