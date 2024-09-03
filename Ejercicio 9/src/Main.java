import java.util.Scanner;

/*
* Pide un numero por teclado y muestra su tabla de multiplicar hasta 10
* */
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingresa el numero: ");
        int numero = sn.nextInt();

        for (int i=1; i<=10 ; i++){
            System.out.println(numero + "*" + i + "=" + (numero*i));
        }


    }
}