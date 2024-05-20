package telaInicio;

import Moedas.Moedas;
import Moedas.modeloMoeda;
import Registro.Registrador;
import com.google.gson.Gson;
import conexao.conexao;
import conversor.Conversor;

import java.util.Scanner;

public class tela_Inicial {


    public void run() {
        int x = 0;
        Registrador registrador = new Registrador();
        do {

            Gson gson = new Gson();
            conexao Conexao = new conexao();
            String Retorno = Conexao.Conectar();
            modeloMoeda Molde = gson.fromJson(Retorno, modeloMoeda.class);
            Moedas Moeda = new Moedas(Molde);
            Conversor conversor = new Conversor();
            double valor;


            System.out.println("Olá Bem Vindo ao Conversor de Moedas!");
            System.out.println("Insira Uma Das Opcões De Conversão Abaixo:" +
                    "\n1-Dolar =>> Peso Argentino" +
                    "\n2-Peso Argentino =>> Dolar" +
                    "\n3-Dolar =>> Real Brasileiro" +
                    "\n4-Real Brasileiro =>> Dolar" +
                    "\n5-Dolar =>> Peso Colombiano" +
                    "\n6-Peso Colombiano =>> Dolar" +
                    "\n7-Dolar =>> Euro" +
                    "\n8-Euro =>> Dolar" +
                    "\n9-exibirRegistro" +
                    "\n10-sair");
            x = new Scanner(System.in).nextInt();



            switch (x) {
                case 1:
                    System.out.println("insira quanto você deseja converter:");
                    valor = new Scanner(System.in).nextDouble();
                    Double c = conversor.dolarPesoArgentino(valor, Moeda);
                    registrador.Regisrar(x,valor,c);
                    break;
                case 2:
                    System.out.println("insira quanto você deseja converter:");
                    valor = new Scanner(System.in).nextDouble();
                    Double d =conversor.PesoArgentinodolar(valor,Moeda);
                    registrador.Regisrar(x,valor,d);
                    break;
                case 3:
                    System.out.println("insira quanto você deseja converter:");
                    valor = new Scanner(System.in).nextDouble();
                    Double e =conversor.dolaraReal(valor, Moeda);
                    registrador.Regisrar(x,valor,e);
                    break;
                case 4:
                    valor = new Scanner(System.in).nextDouble();
                    Double f = conversor.RealDolar(valor, Moeda);
                    registrador.Regisrar(x,valor,f);
                    break;
                case 5:
                    valor = new Scanner(System.in).nextDouble();
                    Double g =conversor.dolarPesoColombiano(valor, Moeda);
                    registrador.Regisrar(x,valor,g);
                    break;
                case 6:
                    valor = new Scanner(System.in).nextDouble();
                    Double h = conversor.PesoColombianoDolar(valor, Moeda);
                    registrador.Regisrar(x,valor,h);
                    break;
                case 7:
                    valor = new Scanner(System.in).nextDouble();
                    Double i =conversor.dolarEuro(valor, Moeda);
                    registrador.Regisrar(x,valor,i);
                    break;
                    case 8:
                        System.out.println("insira quanto você deseja converter:");
                        valor = new Scanner(System.in).nextDouble();
                        Double j = conversor.EuroDolar(valor, Moeda);
                        registrador.Regisrar(x,valor,j);
                        break;
                case 9 :
                    registrador.exibirRegistro();
                    break;
                default:
                    if (x != 10)
                        System.out.println("opção invalida");
            }

        } while (x != 10);


    }


}
