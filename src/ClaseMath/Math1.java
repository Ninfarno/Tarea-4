package ClaseMath;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Math1 {
    static double n, n1, resultado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliga una opcion: \n" +
                " 1. abs \n" +
                " 2. signum \n" +
                " 3. pow \n" +
                " 4. sqrt \n" +
                " 5. cbrt \n" +
                " 6. hypot \n" +
                " 7. round \n" +
                " 8. ceil \n" +
                " 9. floor \n" +
                "10. nextUp \n" +
                "11. nextDown \n" +
                "12. max \n" +
                "13. min \n" +
                "14. random \n" +
                "15. sin \n" +
                "16. cos \n" +
                "17. tan \n" +
                "18. toRadians \n" +
                "19. toDegrees \n" +
                "20. log \n" +
                "21. log10 \n" +
                "22. exp \n" +
                "23. Salir");
        while (true) {
            System.out.println();
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Absoluto de un numero");
                    n = NI(scanner);
                    resultado = Math.abs(n);
                    System.out.printf("|%.0f| = ", n);
                    break;
                case 2:
                    System.out.println("Signo de un numero.");
                    n = NI(scanner);
                    resultado = Math.signum(n);
                    System.out.printf("Signo de %.0f = ", n);
                    break;
                case 3:
                    System.out.println("n1 al exponente n2.");
                    double[] N = ND2(scanner);
                    n = N[0];
                    n1 = N[1];
                    resultado = Math.pow(n, n1);
                    System.out.printf("%.0f^%.0f = ", n, n1);
                    break;
                case 4:
                    System.out.println("Raiz Cuadrada. ");
                    n = NI(scanner);
                    resultado = Math.sqrt(n);
                    System.out.printf("√%.0f = ", n);
                    break;
                case 5:
                    System.out.println("Raiz cubica.");
                    n= NI(scanner);
                    resultado = Math.cbrt(n);
                    System.out.printf("3√%.0f = ", n);
                    break;
                case 6:
                    System.out.println("Hipotenusa.");
                    int N1[] = NI2(scanner);
                    n = N1[0];
                    n1 = N1[1];
                    resultado = Math.hypot(n, n1);
                    System.out.printf("√(%.0f^2 + %.0f^2) = ", n, n1);
                    break;
                case 7:
                    System.out.println("Redondeo simple.");
                    n = ND(scanner);
                    resultado = Math.round(n);
                    System.out.printf("%.2f ≈ ", n);
                    break;
                case 8:
                    System.out.println("Redondeo superior.");
                    n = ND(scanner);
                    resultado = Math.ceil(n);
                    System.out.printf("%.2f ≈ ", n);
                    break;
                case 9:
                    System.out.println("Redondeo inferior.");
                    n = ND(scanner);
                    resultado = Math.floor(n);
                    System.out.printf("%.2f ≈ ", n);
                    break;
                case 10:
                    System.out.println("Float superior.");
                    n = ND(scanner);
                    resultado = Math.nextUp(n);
                    System.out.printf("Superior(%.2f) = ", n);
                    break;
                case 11:
                    System.out.println("Float inferior.");
                    n = ND(scanner);
                    resultado = Math.nextDown(n);
                    System.out.printf("Inferior(%.2f) = ", n);
                    break;
                case 12:
                    System.out.println("Devuelve el numero mayor.");
                    int[] N2 = NI2(scanner);
                    n = N2[0];
                    n1 = N2[1];
                    resultado = Math.max(n, n1);
                    System.out.printf("Max(%.0f, %.0f) = ", n, n1);
                    break;
                case 13:
                    System.out.println("Devuelve el numero menor");
                    int[] N3 = NI2(scanner);
                    n = N3[0];
                    n1 = N3[1];
                    resultado = Math.min(n, n1);
                    System.out.printf("Min(%.0f, %.0f) = ", n, n1);
                    break;
                case 14:
                    System.out.println("Randomizar 0.0 - 0.1 o entre n valor .");
                    n = NI(scanner);
                    for (int i = 0; i <= 3; i++) {
                        resultado = (Math.random() * n) + 1;
                        System.out.printf("random(%.0f) = %.0f ", n, resultado);
                        if (i<3){
                            System.out.print(" | ");
                        }
                    }
                    System.out.println();
                    break;
                case 15:
                    System.out.println("Devuelve el valor de sin en radianes, Sin(n).");
                    n = ND(scanner);
                    resultado = Math.sin(n);//Math.pi es pi
                    System.out.printf("Sin(%.2f) = ", n);
                    break;
                case 16:
                    System.out.println("Devuelve el valor de cos en radianes, Cos(n).");
                    n = ND(scanner);
                    resultado = Math.cos(n);
                    System.out.printf("Cos(%.2f) = ", n);
                    break;
                case 17:
                    System.out.println("Devuelve el valor de tan en radianes, Tan(n).");
                    n = ND(scanner);
                    resultado = Math.tan(n);
                    System.out.printf("Tan(%.2f) = ", n);
                    break;
                case 18:
                    System.out.println("Conversion Grados --> Radianes.");
                    n = ND(scanner);
                    resultado = Math.toRadians(n);
                    System.out.printf("Rad(%.2f) = ", n);
                    break;
                case 19:
                    System.out.println("Conversion Radianes --> Grados");
                    n = ND(scanner);
                    resultado = Math.toDegrees(n);
                    System.out.printf("Grad(%.2f) = ", n);
                    break;
                case 20:
                    System.out.println("Logaritmo natural (base e).");
                    n = ND(scanner);
                    resultado = Math.log(n);
                    System.out.printf("log(%.2f) = ", n);
                    break;
                case 21:
                    System.out.println("Logaritmo base 10.");
                    n = ND(scanner);
                    resultado = Math.log10(n);
                    System.out.printf("log10(%.2f) = ", n);
                    break;
                case 22:
                    System.out.println("Exponencial (e)");
                    n = NI(scanner);
                    resultado = Math.exp(n);
                    System.out.printf("exp(%.2f) = ", n);
                    break;
                default:
                    System.out.println("Gracias por Probar!!  :D");
                    scanner.close();
                    return;
            }
            if (!(opcion == 14)) {
                if (resultado%1==0) {
                    System.out.printf("%.0f\n", resultado);
                } else{
                    System.out.println(resultado);
                }
            }
        }
    }

    public static int NI(Scanner scanner) { //Pide un entero
        System.out.print("n int: ");
        return scanner.nextInt();
    }

    public static double ND(Scanner scanner) { //Pide un doble
        System.out.print("n double: ");
        return scanner.nextDouble();
    }

    public static int[] NI2(Scanner scanner) { // No se uso pero en caso de que funcione lo guardo aqui
        System.out.print("n1 y n2 int: ");
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        return new int[]{n, n2};
    }

    public static double[] ND2(Scanner scanner) { //Pide dos dobles
        System.out.print("n1 y n2 double: ");
        double n = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        return new double[]{n, n2};
    }
}