/*
*
*   Pide un año por teclado e indica si es bisiesto o no.
*
*   Un año es bisiesto cuando es divisible por 4 y no es dibisible por 100
*   o es divisible por 400
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el año a calcular: ");
        int year = sn.nextInt();

        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
            System.out.println("El año "+ year + " es bisiesto");
        }else{
            System.out.println("El año "+ year + " no es bisiesto");

        }



    }
}