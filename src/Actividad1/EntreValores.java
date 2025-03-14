package Actividad1;

import java.util.Scanner;

public class EntreValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese 2 numeros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();//Solicita ambos numeros a la vez ej. 1 6

        if ((n1-n2)==1 || (n1-n2)==-1 || n1==n2){
            //Ya que no hay numeros enteros entre ej. 5 y 6
            System.out.printf("No hay numeros enteros entre %d y %d", n1, n2);
        } else if (n1 < n2){
            System.out.printf("Los numeros enteros entre %d y %d son: ", n1, n2);
            for (int i=n1; i < (n2-1); i++){ //Limita el rango a los numeros entre n1 y n2
                System.out.printf(i+1 + " ");
            }
        } else if (n1 > n2) {
            System.out.printf("Los numeros enteros entre %d y %d son: ", n1, n2);
            for (int i=n1; i > (n2+1); i--) {//limita el rango a los numeros entre n2 y n1
                System.out.printf(i-1 + " ");
            }
        }
        scanner.close();
    }
}
