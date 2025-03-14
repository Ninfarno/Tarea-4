package Actividad1;

public class Bucle1N {
    public static void main(String[] args) {
        System.out.print("Ingrese ");
        int n = N.obtener(); //Usa la clase Actividad1.N la funcion para obtener n
        for (int i=0; i<n; i++){
            System.out.printf(i+1+ " ");//Imprime el valor correcto y agrega un espacio
            if((i+1)%10==0) {
                System.out.printf("\n");//Cada 10 digitos dara un salto de linea para que no se satura una linea
            } else if(i>=n){
                    break;
                }
            }
        }
    }
