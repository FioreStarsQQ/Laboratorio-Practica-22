// Matriz Triangular: triSuperior, triInferior
public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        if (esCuadrada(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // if (i < j) {
                    matriz[i][j] = 0; // para comprobación
                    // } else {
                    // matriz[i][j] = (int) (Math.random() * 20) + 1;
                    // }
                    // Imprime valores de la matriz
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("¿Es triangular superior?\n"+triSuperior(matriz));
            System.out.println("¿Es triangular inferior?\n"+triInferior(matriz));
        } else {
            System.out.println("No es una matriz triangulo superior ni inferior.");
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

    // Comprueba si es una matriz triangular superior
    public static boolean triSuperior(int[][] matriz) {
        int verificar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j) {
                    if (matriz[i][j] == 0 ) {
                        verificar = 1;
                    }
                } else {
                    if (matriz[i][j] != 0 ) {
                        verificar = 1;
                    }
                }
            }
        }
        return (verificar == 0);
    }
    
    // Comprueba si es una matriz triangular inferior
    public static boolean triInferior(int[][] matriz) {
        int verificar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
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
