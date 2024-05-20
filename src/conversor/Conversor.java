package conversor;


import Moedas.Moedas;

public class Conversor {

    public double dolaraReal(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getReal();
        double Razao = y / x;
        System.out.println(valor);
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }


    public double RealDolar(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getReal();
        double Razao = x / y;
        System.out.println(valor);
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }

    public double dolarPesoArgentino(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getPesoArgentino();
        double Razao = y / x;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }

    public double PesoArgentinodolar(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getPesoArgentino();
        double Razao = x / y;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }

    public double dolarPesoColombiano(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getPesoColombiano();
        double Razao = y / x;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }

    public double PesoColombianoDolar(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getPesoColombiano();
        double Razao = x / y;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }


    public double dolarEuro(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getEuro();
        double Razao = 0;
        Razao = y /x ;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }


    public double EuroDolar(double valor, Moedas moeda) {
        double x = moeda.getDolar();
        double y = moeda.getEuro();
        double Razao = 0;
        Razao = x / y;
        valor = valor * Razao;
        System.out.println("O valor após conversão é " + valor + "\n");
        return valor;
    }


}
