/*
*
*   Pide 2 operandos, un operador ( + - * /) y realiza la operacion correspondiente.
*
*   Si el operador es invalido o el segundo operando es 0 en el caso de la division,
*   debes indicar que no se puede realizar la operacion
*
* */


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        sn.useDelimiter("\n");
        System.out.println("Ingresa el primer numero: ");
        double numero1 = sn.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        double numero2 = sn.nextDouble();

        System.out.println("Ingresa el operando: ( + - * / )");
        char operando = sn.next().charAt(0);

        double resultado = 0;
        boolean correcto = true;

        switch (operando){
            case '+':
                resultado = numero1+numero2;
                break;
            case '-':
                resultado = numero1-numero2;
                break;

            case '*':
                resultado = numero1*numero2;
                break;
            case '/':
                if (numero2 != 0){
                    resultado = numero1/numero2;
                }else{
                    correcto = false;
                }
                break;
            default:
                System.out.println("No se puede realizar la operacion");
                correcto = false;
        }
        if (correcto){
            System.out.println("El resultado es: " + resultado);
        }

    }
}