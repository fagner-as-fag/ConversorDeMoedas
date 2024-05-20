package Moedas;

public class Moedas {
    private double Dolar;
    private double Real;
    private double pesoArgentino;
    private double pesoColombiano;
    private double Euro;

    public double getEuro() {
        return Euro;
    }

    public Moedas(modeloMoeda modelo) {
      this.Dolar =Double.parseDouble(String.valueOf(modelo.conversion_rates().get("USD")));
        this.Real = Double.parseDouble(String.valueOf(modelo.conversion_rates().get("BRL")));
        this.pesoColombiano = Double.parseDouble(String.valueOf(modelo.conversion_rates().get("COP")));
        this.pesoArgentino = Double.parseDouble(String.valueOf(modelo.conversion_rates().get("ARS")));
        this.Euro = Double.parseDouble(String.valueOf(modelo.conversion_rates().get("EUR")));

    }

    public double getDolar() {
        return Dolar;
    }

    public double getReal() {
        return Real;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getPesoColombiano() {
        return pesoColombiano;
    }

    @Override
    public String toString() {
        return "Moedas{" +
                "Dolar=" + Dolar +
                ", Real=" + Real +
                ", pesoArgentino=" + pesoArgentino +
                ", pesoColombiano=" + pesoColombiano +
                '}';
    }
}











