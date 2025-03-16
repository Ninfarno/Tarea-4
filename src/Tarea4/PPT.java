package Tarea4;

import java.util.InputMismatchException; //Usado en el try catch
import java.util.Scanner;

public class PPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PJ = 0;
        String OpcionJ;
        int PB = 0;
        int OpcionB;
        int n;

        while (true) {
            System.out.print("N. Rondas: ");

            try { /*Lo investigue por mi parte ya que queria implementar esta funcion
                los datos los agregare al PDF junto con la investigacion de Math*/
                n = scanner.nextInt();
                scanner.nextLine(); //Limpia el salto de linea

                if (n <= 0) { //Esto limita el rago entre 1 y 10 rondas
                    System.out.println("El numero de rondas no es suficiente \nRondas Min: 1");
                } else if (n <= 10) {
                    System.out.println();
                    break;
                } else {
                    System.out.println("Son demasiadas Rondas \nRondas Max: 10");
                }
            } catch (InputMismatchException e) { /* InputMismatchException es en caso de que el dato ingresado no es el
            esperado Ej. Espera un int pero se escribe un character o string se ejecuta este*/
                System.out.println("Error!! \nIngresa un numero");
                scanner.nextLine();
            }
        }

        // Imprime las opciones
        System.out.println("Opciones:");
        System.out.print("1. Piedra \n2. Papel \n3. Tijeras\n");

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.print("Eliga: ");
            OpcionJ = scanner.nextLine();

            //Evalua si la opcion es valida y vuelve a preguntar y la ronda no cuenta
            if (!(OpcionJ.equals("1") || OpcionJ.equals("2") || OpcionJ.equals("3") ||
                    OpcionJ.equals("Piedra") || OpcionJ.equals("Papel") || OpcionJ.equals("Tijeras") ||
                    OpcionJ.equals("piedra") || OpcionJ.equals("papel") || OpcionJ.equals("tijeras"))) {
                System.out.println("Opcion no valida");
                i--;
                continue;
            }
            OpcionB = (int) (Math.random() * 3) + 1; //Randomiza con Math.random para las opciones del Bot

            int Resultado = Evaluar(OpcionB, OpcionJ); //Analiza las opciones del Bot y Jugador

            int[] Puntajes = Resultados(Resultado, PJ, PB); //Analiza los resultados de la ronda
            //Actualiza los puntajes
            PJ = Puntajes[0];
            PB = Puntajes[1];
        }
        Finales(PB, PJ); //Muestra el resultado final del "partido"

        scanner.close();
    }

    public static int Evaluar(int OpcionB, String OpcionJ) {
        int Resultado = 0;

        System.out.print("Bot: ");
        // Sii jugador elige piedra
        if (OpcionJ.equals("1") || OpcionJ.equals("Piedra") || OpcionJ.equals("piedra")) { //.equals simplifico mucho estas condicionales '.-.
            // Opciones del Bot
            if (OpcionB == 1) {
                System.out.println("Piedra!!");
                Resultado = 1;
            } else if (OpcionB == 2) {
                System.out.println("Papel!!");
                Resultado = 2;
            } else if (OpcionB == 3) {
                System.out.println("Tijeras!!");
                Resultado = 3;
            }
            // Sii jugador elige papel
        } else if (OpcionJ.equals("2") || OpcionJ.equals("Papel") || OpcionJ.equals("papel")) {
            // Opciones del Bot
            if (OpcionB == 1) {
                System.out.println("Piedra!!");
                Resultado = 3;
            } else if (OpcionB == 2) {
                System.out.println("Papel!!");
                Resultado = 1;
            } else if (OpcionB == 3) {
                System.out.println("Tijeras!!");
                Resultado = 2;
            }
            // Sii jugador elige tijeras
        } else if (OpcionJ.equals("3") || OpcionJ.equals("Tijeras") || OpcionJ.equals("tijeras")) {
            //Opciones del Bot
            if (OpcionB == 1) {
                System.out.println("Piedra!!");
                Resultado = 2;
            } else if (OpcionB == 2) {
                System.out.println("Papel!!");
                Resultado = 3;
            } else if (OpcionB == 3) {
                System.out.println("Tijeras!!");
                Resultado = 1;
            }
        }
        return Resultado;
    }

    public static int[] Resultados(int Resultado, int PJ, int PB) {
        /*
        Posibles Resultados
        1: Empate
        2: Gana el Bot
        3: Gana el jugador
        */
        if (Resultado == 0) {
            System.out.println("Surgio un Error\n*Mensaje para el programador*");
        } else if (Resultado == 1) {
            System.out.println("Empate");
        } else if (Resultado == 2) {
            System.out.println("Gana el Bot");
            PB++;
        } else if (Resultado == 3) {
            System.out.println("Gana el jugador");
            PJ++;
        }

        System.out.println("Jugador: " + PJ + " | Bot: " + PB);
        return new int[]{PJ, PB}; //Es para actualizar los valores de PB y PJ en el main
    }

    public static void Finales(int PB, int PJ) {
        System.out.print("Ganador Final: ");
        //Analiza los resultados
        if (PB == PJ) {
            System.out.println("Ninguno \nFue un empate");
        } else if (PB > PJ) {
            System.out.println("Bot");
        } else if (PJ > PB) {
            System.out.println("Jugador");
        }
    }
}