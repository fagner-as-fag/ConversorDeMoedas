package Registro;

import java.util.ArrayList;
import java.util.List;

public class Registrador {
    List<Registro> RegistroDeConversões = new ArrayList<>();


    public void Regisrar(int x, double y, double z) {

        String m = null;

        switch (x) {
            case 1:
                m = "Dolar =>> Peso Argentino";
                break;
            case 2:
                m = "Peso Argentino =>> Dolar";
                break;
            case 3:
                m = "Dolar =>> Real Brasileiro";
                break;
            case 4:
                m = "Real Brasileiro =>> Dolar";
            case 5:

                m = "Dolar =>> Peso Colombiano";
                break;
            case 6:

                m = "Peso Colombiano =>> Dolar";
                break;
            case 7:

                m = "Dolar =>> Euro";
                break;
            case 8:
                m = "Euro =>> Dolar";


        }
Registro registro= new Registro(m,y,z);
        RegistroDeConversões.add(registro);



    }

public  void exibirRegistro(){

        for ( Registro registro : this.RegistroDeConversões){
            System.out.println("\n"+registro);

        }
}


}
