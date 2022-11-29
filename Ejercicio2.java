import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[][]=new int[5][6];
        int sumaV=0;
        int sumaH =0;
        System.out.println("Introduzca 20 número enteros");
        for(int fila = 0 ; fila<4 ; fila++){
            for (int columna = 0; columna < 5 ; columna++){
                x[fila][columna]=sc.nextInt();
            }
        }
        System.out.printf("Columna %d\tColumna %d\tColumna %d\tColumna %d\tColumna %d\tColumna %d\t",0,1,2,3,4,5);
        System.out.println();
        for(int fila = 0 ; fila<4 ; fila++){
            sumaH=0;
            System.out.println();
            for (int columna = 0; columna < 5 ; columna++){
                sumaH=sumaH+x[fila][columna];
                System.out.printf("\t%d\t",x[fila][columna]);
            }
            System.out.printf("|%7d ", sumaH);
        }
        int total=0;
        System.out.println();
        System.out.print("-----------------------------------------------------------------------------------------\n   ");
        for(int columna = 0 ; columna<5 ; columna++){
            sumaV=0;
            for (int fila = 0; fila < 4 ; fila++){
                sumaV=sumaV+x[fila][columna];
            }
            total+=sumaV;
            System.out.printf("%7d\t   ", sumaV);
        }
        System.out.printf("\nTOTAL:                                                                          %7d ", total);

            sc.close();
    }
}
