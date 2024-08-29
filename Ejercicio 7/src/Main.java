/*
*
* Mostrar la suma de los numeros hasta que el usuario introduzca un -1
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        while (i != -1){
            System.out.println("Ingresa un numero: ");
            suma += i;
            i = sn.nextInt();

        }
        System.out.println("La suma total fue: " + suma);
    }
}