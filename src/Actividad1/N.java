package Actividad1;

import java.util.Scanner;
public class N {
    public static int obtener() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
}
