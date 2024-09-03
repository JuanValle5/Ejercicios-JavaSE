/*
* Muestra los numeros de l1 al 100 que sean divisibles entre 2 y 3
* */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}