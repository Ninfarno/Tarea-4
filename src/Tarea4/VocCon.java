package Tarea4;
import java.util.Scanner;

public class VocCon {

    public static void main(String[] args) {
        int ContVocales;
        int ContConsonantes;
        Scanner scanner = new Scanner(System.in);
        char[] vocales = {'a', 'e', 'i', 'o', 'u',
                          'A', 'E', 'I', 'O', 'U'};
        char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                              'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'}; //Esta linea si use inteligencia artificial suelo saltarme mayusculas °-°'


        while (true) {
            ContVocales=0;
            ContConsonantes=0;
            System.out.print("Ingrese una frase: ");
            String Frase = scanner.nextLine();

            if (Frase.equals("exit") || Frase.equals("Exit")) {
                break;
            } else {
                ContVocales = EvaluarVocales(Frase, vocales, ContVocales); //Evalua las Vocales
                ContConsonantes = EvaluarConsonantes(Frase, consonantes, ContConsonantes); //Evalua las consonantes
                Escribir(Frase, vocales, consonantes, ContVocales, ContConsonantes); //Escribe los resultados

            }
        }

        scanner.close();
    }

    public static int EvaluarVocales(String Frase, char[] vocales, int ContVocal) {
        for (int i = 0; i < vocales.length; i++) {
                for (int j = 0; j < Frase.length(); j++) {
                if (Frase.charAt(j) == vocales[i]) {
                    ContVocal++;
                }
            }
        }
        return ContVocal;
    }

    public static int EvaluarConsonantes(String Frase, char[] consonantes, int ContConsonantes){
        for (int i = 0; i < consonantes.length; i++) {
            for (int j = 0; j < Frase.length(); j++) {
                if (Frase.charAt(j) == consonantes[i]) {
                    ContConsonantes++;
                }
            }
        }
        return ContConsonantes;
    }

    public static void Escribir(String Frase, char[] vocales, char[] consonantes, int ContVocales, int ContConsonantes) {
        System.out.printf("Vocales: %d\n", ContVocales);
        for (int i = 0; i < Frase.length(); i++) {
            boolean ingresado = false;
            for (int j = 0; j < vocales.length; j++) {
                if (Frase.charAt(i) == vocales[j]) {
                    System.out.printf("%c", Frase.charAt(i));
                    ingresado = true;
                    break;
                }
            }
            if(!ingresado){
                System.out.print("°");
            }
        }
        System.out.println();
        System.out.printf("Consonantes: %d\n", ContConsonantes);
        for (int i = 0; i < Frase.length(); i++){
            boolean ingresado = false;
            for (int j = 0; j < consonantes.length; j++){
                if (Frase.charAt(i) == consonantes[j]){
                    System.out.printf("%c", Frase.charAt(i));
                    ingresado = true;
                    break;
                }
            }
            if(!ingresado){
                System.out.print("°");
            }
        }
        System.out.println();
    }
}