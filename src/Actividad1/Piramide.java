package Actividad1;

public class Piramide {
    public static void main(String[] args) {
        System.out.println("Numero de escalones de la Actividad1.Piramide.");
        int n = N.obtener(); // Uso nuevamente la funcion que esta en Actividad1.N para obtener n

        Continuo:
        for (int i = 1; i <= n; i++){ //Ciclo vertical de piramide
            //Ciclos Horizontales de piramide
            for (int j = i; j <= n; j++) { //Imprime los espacios antes del numero
                for (int z = 0; z < 2; z++) { //Alinea la piramide... al menos hasta la fila 9
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++){ //Imprime la primera parte horizontal que es hasta el maximo de esa fila
                System.out.print(j + " ");
            }
            for (int j = (i-1); j >= 1; j--){ //Imprime el resto de numeros despues del numero maximo de esa fila
                System.out.print(j + " ");
            }
                System.out.println(); //Salto de linea tras cada fila
        }
    }
}
