import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x[][]=new int[3][6];
    x[0][0]=0;
    x[1][0]=75;
    x[0][1]=30;
    x[0][2]=2;
    x[2][2]=-2;
    x[2][3]=9;
    x[1][4]=0;
    x[0][5]=5;
    x[2][5]=11;
    System.out.printf("\tColumna %d\tColumna %d\tColumna %d\tColumna %d\tColumna %d\tColumna %d\t",0,1,2,3,4,5);
    System.out.println();
    for(int fila = 0 ; fila<3 ; fila++){
        System.out.print("Fila: "+ fila);
        for (int columna = 0; columna < 6 ; columna++){
            System.out.printf("\t%10d ", x[fila][columna]);
        }
        System.out.println();
    }
}
}