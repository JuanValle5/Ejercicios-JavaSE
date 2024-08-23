/*
*   Pide el precio de un producto sin IVA y calcula su precio con IVA.
*   El IVA es del 21%.
*   Formatea el resultado para que se muestre con dos decimales.
*
* */


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);

        final double IVA = 1.21;

        System.out.println("Introduce el valor del producto");

        double precio = sn.nextDouble();

        double precioFinal = precio * IVA;

        System.out.printf("El precio final es %.2f $", precioFinal);
    }
}