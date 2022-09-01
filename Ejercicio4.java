// Cree un método que reciba una matriz y compruebe si es diagonal. Una matriz es diagonal si
// todos los elementos son ceros excepto la diagonal principal.
// boolean esDiagonal( int [ ] [ ] matriz )
public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        if (esCuadrada(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // if (i == j) {
                    // matriz[i][j] = 0; // matriz[i][j] = (int) (Math.random() * 20) + 1; para
                    // comprobación
                    // } else {
                    matriz[i][j] = (int) (Math.random() * 20) + 1;
                    // }
                    // Imprime valores de la matriz
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println(esDiagonal(matriz));
        } else {
            System.out.println("No es una matriz diagonal");
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
    // Comprueba si es una matriz diagonal
    public static boolean esDiagonal(int[][] matriz) {
        int verificar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j) {
                    if (matriz[i][j] != 0) {
                        verificar = 1;
                    }
                } else {
                    if (matriz[i][j] == 0) {
                        verificar = 1;
                    }
                }
            }
        }
        return (verificar == 0);
    }
}
