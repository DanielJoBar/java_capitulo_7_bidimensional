import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[][]=new int[5][6];
        int sumaV=0;
        int sumaH =0;
        for(int fila = 0 ; fila<4 ; fila++){
            for (int columna = 0; columna < 5 ; columna++){
                int aleatorio = (int)(Math.random()*900+100);
                x[fila][columna]=aleatorio;
            }
        }
        System.out.printf("Columna %d     Columna %d       Columna %d      Columna %d     Columna %d    Suma ",0,1,2,3,4);
        System.out.println();
        for(int fila = 0 ; fila<4 ; fila++){
            sumaH=0;
            
            for (int columna = 0; columna < 5 ; columna++){
                if(columna<4){
                sumaH=sumaH+x[fila][columna];
                System.out.printf("   %d\t      ",x[fila][columna]);
                }
                else if(columna==4){
                sumaH=sumaH+x[fila][columna];
                System.out.printf("%d       |%d ",x[fila][columna],sumaH);
                System.out.println();
            }}
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
            System.out.printf("%d\t\t ", sumaV);
        }
        System.out.printf("\nTOTAL:                                                                 %7d ", total);

            sc.close();
    }
}
