package Default;

import Entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a altura e largura do retangulo: ");
        retangulo.setAltura(sc.nextDouble());
        retangulo.setLargura(sc.nextDouble());

        //System.out.printf("Valores digitados: %.2f e %.2f", retangulo.getAltura(),retangulo.getLargura());

        retangulo.String();


        sc.close();

        System.exit(0);

    }

}
