package application;
import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double p, areaX, areaY;
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com os valores do triangulo X: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        System.out.println("Entre com os valores do triangulo Y: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        p = (x.a + x.b + x.c) / 2;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        areaY = Math.sqrt(p * ( p - y.a) * (p - y.b) * (p - y.c));

        System.out.println("Triangulo X area:  " + areaX);
        System.out.println("Triangulo Y area:  " + areaY);

        if( areaX > areaY){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
        teclado.close();

        

    }
}



