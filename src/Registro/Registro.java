package Registro;

public class Registro {


    private double valor;
    private String tipoDeOperacao;
    private double convertido;

    @Override
    public String toString() {
        return "operação :"
                + this.tipoDeOperacao +
                "\nvalor inicial: " +
                this.valor +
                "\nvalor após conversão: " +
                this.convertido
                ;
    }

    public Registro(String m, double y, double z) {
        this.valor = y;
        this.tipoDeOperacao = m;
        this.convertido = z;
    }
}
