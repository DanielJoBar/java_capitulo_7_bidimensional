public class Ejercicio5 {
    public static void main(String [] args){
        int posiciónMaxV =0;
        int posiciónMaxH = 0;
        int posiciónMinV = 0;
        int posiciónMinH = 0;
        int aleatorio= 0;
        int maximo = -1;
        int minimo =2000;
        int array[][] = new int[6][10];
        for (int i = 0 ; i< 6 ; i++){
             for (int j = 0 ; j < 10;j++){
                aleatorio = (int)(Math.random()*1001);
                array[i][j]=aleatorio;
                if(array[i][j]<minimo){
                    minimo=array[i][j];
                    posiciónMinH = i;
                    posiciónMinV = j;
                }
                else if(array[i][j]>maximo){
                    maximo=array[i][j];
                    posiciónMaxH=i;
                    posiciónMaxV=j;
                }
             }
        }
        for (int i = 0; i < 6 ; i++){
            for (int j = 0; j< 10 ; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("La posicion del numero minimo de la array, "+minimo+" está en la posición: "+posiciónMinH+" , "+posiciónMinV);
        System.out.println("La posicion del numero máximo de la array, "+maximo+" está en la posición: "+posiciónMaxH+" , "+posiciónMaxV);        
    }
}
