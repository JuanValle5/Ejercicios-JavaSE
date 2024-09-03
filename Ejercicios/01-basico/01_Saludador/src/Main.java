import java.util.Scanner;

/*
 *   Pide un nombre por teclado y haz que te salude
 *
 *   Por ejemplo, si introduces "Fernando", la respuesta debe ser ¡Hola Fernando!
 *
 * */
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sn.next();
        System.out.printf("¡Hola %s!", nombre);

    }
}