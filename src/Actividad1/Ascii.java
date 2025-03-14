package Actividad1;

public class Ascii {
    public static void main(String[] args) {
        System.out.println("|   Valor Numerico   |      Caracter      |");
        System.out.println("|-----------------------------------------|");

        for(int i=0; i < 128; i++){
            if(i >= 32 && i <= 126) {
                System.out.printf("|%3d                 | %c                  |\n", i, (char) i);
            } else {
                System.out.printf("|%3d                 | Sin Valor          |\n", i);
            }
        }
    }
}