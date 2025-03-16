package Tarea4;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { //Ciclo para que puedas crear la contraseña sin tener que repetir
            System.out.print("Ingrese una contraseña: ");
            String contraseña = scanner.nextLine();

            String Resultado = Verificacion(contraseña);
            System.out.println(Resultado);
            if (Resultado == "Contraseña valida"){ //Si la contraseña es valida el bucle se termina
                System.out.println("Vuelva pronto :D");
                break;
            }
        }
        scanner.close();
    }

    public static String Verificacion(String contraseña) {
        String Respuesta = "Contraseña valida"; // no se modificara a menos que haya un error con la contraseña
        int ContadorN=0; // Contador de numeros
        int ContadorLm=0; // Contador de minuscualas
        int ContadorLM=0; // Contador de mayusculas
        int ContadorCE=0; // Contador de caracteres especiales
        //Nota: El espacio cuenta como caracter especial


        if(contraseña.length() < 8){
            // Analiza si la contraseña es menor a 8 caracteres
            Respuesta = "La contraseña es muy corta";
        } else if (contraseña.length() > 16) {
            // Analiza si la contraseña es mayor a 16 caracteres
            Respuesta = "La contraseña es muy larga";
        } else if((contraseña.charAt(0) <= 'a' && contraseña.charAt(0) >= 'z') || (contraseña.charAt(0) <= 'A' && contraseña.charAt(0) >= 'Z')) {
            // Analiza si el primer caracter sea una letra ya sea mayuscula o minuscula
            Respuesta = "La contraseña debe iniciar con una letra";
        } else  if((contraseña.charAt(contraseña.length()-1) < '0') && (contraseña.charAt(contraseña.length()-1) > '9')){
            // Analiza si la contraseña termina con un numero
            Respuesta = "La contraseña debe terminar con un numero";
        } else {
            // Inicia los contadores en caso de que esta bien los criterios anteriores
            for (char c: contraseña.toCharArray()){// Analiza caracter por caracter si es un tipo u otro
                if (c >= '0' && c <= '9'){
                    ContadorN++;
                } else if (c >= 'a' && c <= 'z'){
                    ContadorLm++;
                } else if (c >= 'A' && c <= 'Z'){
                    ContadorLM++;
                } else {
                    ContadorCE++;
                }
            }
            if (ContadorN <= 1){
                Respuesta = "La contraseña debe tener mas Numeros";
            } else if (ContadorLm <= 1){
                Respuesta = "La contraseña debe tener mas Minusculas";
            } else if (ContadorLM <= 0){
                Respuesta = "La contraseña No tiene Mayusculas";
            } else if (ContadorCE <= 0){
                Respuesta = "La contraseña No tiene Caracteres Especiales";
            }
        }
        return Respuesta;
    }
}