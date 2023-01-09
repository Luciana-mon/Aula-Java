package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double xA, xB, xC, yA, yB, yC, p, areaX, areaY;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com os valores do triangulo X: ");
        xA = teclado.nextDouble();
        xB = teclado.nextDouble();
        xC = teclado.nextDouble();

        System.out.println("Entre com os valores do triangulo Y: ");
        yA = teclado.nextDouble();
        yB = teclado.nextDouble();
        yC = teclado.nextDouble();

        p = (xA + xB + xC) / 2;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt(p * ( p - yA) * (p - yB) * (p - yC));

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



