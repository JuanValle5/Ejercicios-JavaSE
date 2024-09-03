import java.util.Scanner;

/*
*   Pide un numero por teclado y comprueba que sea positivio
* */
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.println("Ingresa el numero a validar: ");
            numero = sn.nextInt();
            if (numero<0){
                System.out.println("Error, el numero debe ser positivo");
            }
        }while (numero<0);
        System.out.println("El numero es: " + numero);
    }
}