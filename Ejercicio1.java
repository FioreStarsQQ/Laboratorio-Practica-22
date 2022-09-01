// Laboratorio N° 22. Ejercicio 1
// Autor: Fiorela Clariza Quispe Quispe
// Colaboro: 
// Tiempo: 15 min
// Cree un método que reciba una matriz e indique si es una matriz cuadrada. La matriz cuadrada tiene el mismo número de filas y de columnas.
// boolean esCuadrada( int [ ] [ ] matriz )
public class Ejercicio1 {
    public static void main(String[] args) {
        // int[][] matrizPrueba = new int[3][4];
        int[][] matriz00 = new int[2][2];
        for (int i = 0; i < matriz00.length; i++) {
            for (int j = 0; j < matriz00[i].length; j++) {
                // Imprime valores de la matriz
                System.out.print(matriz00[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("¿Es una matriz cuadrada?\n>>> " + esCuadrada(matriz00));
    }

    // Metodo que devuelve un booleano para verificar si una matriz es cuadrada o no
    public static boolean esCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + 1 == matriz.length) {
                    return (matriz.length == matriz[i].length);
                }
            }
        }
        return false;
    }
}
