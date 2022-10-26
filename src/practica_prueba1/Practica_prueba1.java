package practica_prueba1;

import java.util.Scanner;

public class Practica_prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        do{
        System.out.println("");
        System.out.println("Bienvenido al programa");
        System.out.println();
        System.out.println("1 -> Opcion 1");
        System.out.println("2 -> Opcion 2");
        System.out.println("3 -> Para salir del programa");
        System.out.println("Ingrese la opcion que desea: ");
        opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1: {
                System.out.println("Ingrese su numero: ");
                int numero = leer.nextInt();
                int dig = 0; int suma = 0;
                while (numero > 0 ) {
                    dig = numero%10;
                    
                    if (dig % 2 == 0){
                        suma = suma + dig;
                    }//Fin if 
                    numero/=10;
                }//Fin while Opcion No.1
                System.out.println("La suma de los digitos pares es de: "+ suma);
            }//Fin case 1
            
            case 2: {
                System.out.println("Ingrese el numero de bloques: ");
                int usuario = leer.nextInt();
                for (int i = 1; i <= usuario; i++) {
                    System.out.print(i);
                    for (int j = 0; j <= i; j++) {
                        System.out.print(j);
                    }
                }
            }//Fin case 2
            break; 
        }//Fin switch
        }while (opcion!=3);
    }//Fin del main
    
}//Fin de la clase
