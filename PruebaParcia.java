
package pruebaparcia;

import java.util.Scanner;



public class PruebaParcia {
   
   
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("Cantidad estudiantes: \n=>");
        int cantidadEstudiantes = read.nextInt();
        String[] nombres = new String[cantidadEstudiantes];
        double[] notasParcial = new double[cantidadEstudiantes * 3];
        double[] notasTotales = new double[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            int notasIndex = 0;
            System.out.println("Ingrese el nombre del estudiante: ");
            read.nextLine();
            nombres[i] = read.nextLine();
            for (int j = notasIndex; j < 3; j++) {
                System.out.println("Ingrese su  nota: ");
                notasParcial[j] = read.nextDouble();
                notasTotales[i] += notasParcial[j];
                notasIndex += 1;
            }
            notasTotales[i] /= 3;
        }

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Nombre:" + nombres[i]);
            System.out.print("\nNota total: " + notasTotales[i]);
            if (notasTotales[i] >= 7) {
                System.out.print("\nEstado: Aprobado");
            } else {
                System.out.print("\nEstado: No aprobado\n");
            }
        }

    }
    
}
