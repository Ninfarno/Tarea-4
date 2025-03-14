package Actividad1;

public class ParesN {
    public static void main(String[] args) {
        System.out.print("Ingrese el rango para los pares ");
        int n = N.obtener(); //Usa de la clase Actividad1.N la funcion obtener para n

        if (n < 0) {
            for (int i = 0; i >= n; i--) {//Ciclo con n negatva
                evaluar(i);
            }
        } else if (n > 0) {
            for (int i = 0; i <= n; i++) {//Ciclo con n positiva
                evaluar(i);
            }
        } else if (n == 0) {//No hay ciclo asi que solo imprimira 0
            System.out.println("0\n");
        }
    }

    public static void evaluar(int i) { //Funcion para escribir menos
        if (i % 2 == 0) { //Evalua si es par o no
            System.out.println(i);
        }
    }
}
