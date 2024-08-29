import java.util.Scanner;

/*
*
*  Pide 3 numeros por teclado, e indica cual de los 3 es mayor
*
*
*
* */
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce el numero 1: ");
        int numero1 = sn.nextInt();

        System.out.println("Introduce el numero 2: ");
        int numero2 = sn.nextInt();

        System.out.println("Introduce el numero 3: ");
        int numero3 = sn.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 >= numero3) {
            System.out.println("El numero mayor es: " + numero2);
        }else{
            System.out.println("El numero mayor es: " + numero3);
        }


    }
}