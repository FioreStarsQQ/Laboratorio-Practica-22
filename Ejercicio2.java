// Laboratorio N° 22. Ejercicio 1
// Autor: Fiorela Clariza Quispe Quispe
// Colaboro: 
// Tiempo: 15 min
// Defina un método que reciba una matriz cuadrada y devuelva la diagonal principal
// int [] diagonal(int [] [] matriz)
public class Ejercicio2 {
    public static void main(String[] args) {
        // int[][] matrizPrueba = new int[3][4];
        int[][] matriz00 = new int[3][3];
        for (int i = 0; i < matriz00.length; i++) {
            for (int j = 0; j < matriz00[i].length; j++) {
                matriz00[i][j] = (int) (Math.random() * 20) + 1;
                // Imprime valores de la matriz
                System.out.print(matriz00[i][j] + "\t");
            }
            System.out.println();
        }

        if (esCuadrada(matriz00)) {
            System.out.print("La diagonal principal contiene a [ ");
            for (int i = 0; i < diagonal(matriz00).length; i++) {
                System.out.print(diagonal(matriz00)[i] + " ");
            }
            System.out.print("]");
        } else {
            System.out.println("No es una matriz cuadrada, por lo tanto, no posible mostrar la diagonal principal.");
        }

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

    public static int[] diagonal(int[][] matriz) {
        int[] c = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    c[i] = matriz[i][j];
                }
            }
        }
        return c;
    }
}
