package Actividad1;

public class Multiplo3 {
    public static void main(String[] args) {
        System.out.println("Los numeros multiplos de 3 son: ");
        for (int i=0; i < 100; i++){
            if ((i%3) == 0){
                System.out.print(i + " ");
            }
        }
    }
}
