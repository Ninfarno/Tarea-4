package Tarea4;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumRand = (int) (Math.random() * 20) + 1;
        int i=1;
        int j=19;

        while (true){
            System.out.print("Escriba un numero entre 1 y 20: ");
            int N = scanner.nextInt();

            if(N == NumRand){
                System.out.printf("Ganste en %d intentos\n", i);
                break;
            } else if (N > NumRand) {
                System.out.printf("El numero es muy alto \nIntentos: %d\n", j);
            } else if (N < NumRand) {
                System.out.printf("El numero es muy bajo \nIntentos: %d\n", j);
            }
            j--;
            i++;
            if(j <= 0){
                System.out.println("Fallaste D:");
                break;
            }
        }
        scanner.close();
    }
}