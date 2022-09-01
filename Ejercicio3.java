// Cree un método que reciba una matriz e indique si es una matriz identidad. La matriz identidad
// tiene 0 en todas las posiciones, excepto en las posiciones de la diagonal, que tiene 1.
// boolean esIdentidad( int [ ] [ ] matriz )
public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        if (esCuadrada(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // if (i == j) {
                    //     matriz[i][j] = 1;
                    // }
                    matriz[i][j] = (int) (Math.random() * 20) + 1;
                    // }
                    // Imprime valores de la matriz
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println(esIdentidad(matriz));
        } else {
            System.out.println("No es una matriz identidad.");
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

    // Metodo que devuelve un booleano para verificar si es una matriz identidad
    public static boolean esIdentidad(int[][] matriz) {
        int verificar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j) {
                    if (matriz[i][j] != 0) {
                        verificar = 1;
                    }
                } else {
                    if (matriz[i][j] != 1) {
                        verificar = 1;
                    }
                }
            }
        }
        return (verificar == 0);
    }
}
