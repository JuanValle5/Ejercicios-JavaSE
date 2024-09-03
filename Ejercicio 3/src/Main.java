/*
*
*   Pide dos numeros por teclado e indica si el segundo es divisible por el primero
*
*   Por ejemplo, si numero1 = 10 y numero2 = 5 deberia mostrar:
*
*   "El numero 5 es divisible entre 10"
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa el numero 1");
        int numero1 = sn.nextInt();
        System.out.println("Ingresa el numero 2");
        int numero2 = sn.nextInt();

        if (numero1 % numero2 == 0){
            System.out.println("El numero " + numero1 + " es divisible entre " + numero2);
        }else{
            System.out.println("El numero " + numero1 + " no es divisible entre " + numero2);

        }




    }
}