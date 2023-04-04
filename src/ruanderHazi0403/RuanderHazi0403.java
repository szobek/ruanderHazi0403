package ruanderHazi0403;

import java.util.Random;
import java.util.Scanner;

public class RuanderHazi0403 {

    /*

    • A., Kérjünk be a felhasználótól tíz keresztnevet.
    • A neveket nagybetűs formátumban, vektorban tároljuk!
    • Listázzuk ki a tömb minden második elemét!
    • Állapítsuk meg, melyik a leghosszabb név!
    • Írjuk ki, melyik névben van a legtöbb ’s’ betű!
    • B., Töltsünk fel egy 4x3-as mátrixot 50 és 100 közötti véletlenszámokkal.
    • Transzponáljuk egy másik mátrixba!
    • Listázzuk ki mindkét mátrixot a megfelelő sor/oszlop formátumban!
    • C., Töltsünk fel egy 3x3-as mátrixot egyjegyű véletlenszámok négyzetre emelt értékeivel.
    • Listázzuk ki a főátlóban található számokat és összegüket!
    • Listázzuk ki fordított sorrendben (az utolsó elemtől az elsőig) az eredetileg generált számokat!
         */

    public static void main(String[] args) {
        cFeladat();
    }

    static void aFeladat() {
        String[] keresztNevek = {"aaa", "nnnnnssssnnnnnnnn", "oo", "swwww", "bbssb", "nnnnnn", "nnnnnnnn", "mmmssssssssssssssmmmm", "ppppppppp", "zzzzzzzzzzzz"};
//        tombFeltoltes(keresztNevek);
//        System.out.println();
        mindenMasodikNev(keresztNevek);
        System.out.println();
        legHosszabbNev(keresztNevek);
        System.out.println();
        legtobbSANevben(keresztNevek);
    }

    static void bFeladat() {
        int[][] matrix1 = new int[4][3];
        int[][] matrix2 = new int[4][3];
        matrixFeltoltes(matrix1);
        matrix1Transzponalas(matrix1, matrix2);
        matrixokListazasa(matrix1, matrix2);
    }

    //------------------------------------------------------------------------------------------------------------------
    static void matrixFeltoltes(int[][] matrix1) {
        Random random = new Random();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(50, 101);

            }
        }
    }

    static void matrix1Transzponalas(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix2[i][j] = matrix1[i][j];

            }
        }
    }

    static void matrixokListazasa(int[][] matrix1, int[][] matrix2) {

        System.out.println("matrix1");
        for (int[] ints : matrix1) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nmatrix2");
        for (int[] tomb : matrix2) {
            for (int j = 0; j < tomb.length; j++) {
                System.out.print(tomb[j] + " ");
            }
            System.out.println();
        }
    }
//----------------------------------------------------------------------------------------------------------------------

    static void cFeladat() {
        double[][] matrix = new double[3][3];
        matrixFeltoltesUjra(matrix);
        forditottLista(matrix);
    }

    static void matrixFeltoltesUjra(double[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.pow(random.nextInt(10), 2);

            }
        }
    }

    static void atloSzamokEsOsszeguk(double[][] matrix) {
        double atloOsszeg = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("az átlóban az első: " + matrix[i][j]);
                    atloOsszeg += matrix[i][j];
                }
                if (i == 1 && j == 1) {
                    System.out.println("az átlóban a 2.: " + matrix[i][j]);
                    atloOsszeg += matrix[i][j];
                }
                if (i == 2 && j == 2) {
                    System.out.println("az átlóban a 3.: " + matrix[i][j]);
                    atloOsszeg += matrix[i][j];
                }
            }
        }
        System.out.println("Az átló összege: "+atloOsszeg);
    }

    static void forditottLista(double[][] matrix) {
        ellenorzoLista(matrix);
        System.out.println();
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        atloSzamokEsOsszeguk(matrix);
    }

    static void ellenorzoLista(double[][] matrix) {
        for (double[] elem : matrix) {
            for (double v : elem) {
                System.out.print(v + " ");

            }
            System.out.println();
        }
    }


//----------------------------------------------------------------------------------------------------------------------


    static void tombFeltoltes(String[] keresztNevek) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < keresztNevek.length; i++) {
            System.out.print("Adja meg a nevet: ");
            String nev = sc.nextLine();
            keresztNevek[i] = nev.toUpperCase();
        }
        sc.close();
    }

    static void mindenMasodikNev(String[] keresztNevek) {
        System.out.println("Minden 2.: ");
        for (int i = 0; i < keresztNevek.length; i++) {
            if (i % 2 == 1) {

                System.out.println(keresztNevek[i]);
            }
        }
        System.out.println();
    }

    static void legHosszabbNev(String[] keresztNevek) {
        int nevHossza = keresztNevek[0].length();
        int leghosszabbNevIndex = 0;
        for (int i = 1; i < keresztNevek.length; i++) {
            if (nevHossza < keresztNevek[i].length()) {
                leghosszabbNevIndex = i;
                nevHossza = keresztNevek[i].length();
            }
        }
        System.out.println("A leghosszabb név: " + keresztNevek[leghosszabbNevIndex] + " a hossza: " + nevHossza + " karakter");
    }

    static void legtobbSANevben(String[] keresztNevek) {
        int legtobb = 0;
        String nev = "";
        for (String s : keresztNevek) {
            int tartalmaz = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 's') {
                    tartalmaz++;
                }
            }
            System.out.println("A név: " + s + " " + tartalmaz + "db s-t tartalmaz");
            if (tartalmaz > legtobb) {
                legtobb = tartalmaz;
                nev = s;
            }

        }
        System.out.println("\na legtöbb \"s\": " + legtobb + ", a név: " + nev);
    }

}
