
// Tres en Raya con arreglo bidimensional. versión humano vs humano
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] tablero = new String[3][3];
        int i, j;
        for (int p = 1; p <= 6; p++) {
            do {
                System.out.print("Ingrese la posición i: ");
                i = scan.nextInt();
                System.out.print("Ingrese la posición j: ");
                j = scan.nextInt();
            } while (!(verificarPosicion(--i, --j, tablero)));
            for (int a = 0; a < tablero.length; a++) {
                for (int b = 0; b < tablero[a].length; b++) {
                    if (p % 2 == 0) {
                        tablero[i][j] = "O";
                    } else {
                        tablero[i][j] = "X";
                    }
                    System.out.print(tablero[a][b] + "\t");
                }
                System.out.println();
            }
        }
        scan.close();
    }

    // Comprueba si es una matriz triangular inferior
    public static boolean verificarPosicion(int i, int j, String[][] arreglo) {
        int verificar = 0;
        if (i <= 3 && j <= 3) {
            for (i = 0; i < arreglo.length; i++) {
                for (j = 0; j < arreglo[i].length; j++) {
                    if (arreglo[i][j] != null) {
                        verificar = 1;
                    }
                }
            }
        } else {
            verificar = 1;
        }
        return (verificar == 0);
    }
}
