package Utilitaire;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


        import java.util.Random;

public class util {
    public util() {
    }

    public static int rand(int min, int max) {
        Random r = new Random();
        return min + r.nextInt(max - min);
    }

    public static int[][] InitiateTableInt(int x, int y) {
        int[][] table = new int[x][y];

        for(int i = 0; i < y; ++i) {
            for(int j = 0; j < y; ++j) {
                table[i][j] = 0;
            }
        }

        return table;
    }

    public static int[][] InitiateTableIntRandom(int x, int y) {
        int[][] table = new int[x][y];

        for(int i = 0; i < y; ++i) {
            for(int j = 0; j < y; ++j) {
                table[i][j] = rand(0, 9);
            }
        }

        return table;
    }

    public static double[][] InitiateTableDouble(int x, int y) {
        double[][] table = new double[x][y];

        for(int i = 0; i < y; ++i) {
            for(int j = 0; j < y; ++j) {
                table[i][j] = 0.0D;
            }
        }

        return table;
    }

    public static int dividemore(double x, double y) {
        return x / y - (double)((int)(x / y)) != 0.0D?(int)(x / y) + 1:(int)(x / y);
    }

    public static void printTableInt(int[][] table, int x, int y) {
        for(int i = 0; i < y; ++i) {
            for(int j = 0; j < y; ++j) {
                System.out.print(table[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void printTableDouble(double[][] table, int x, int y) {
        for(int i = 0; i < y; ++i) {
            for(int j = 0; j < y; ++j) {
                System.out.print(table[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void line(int x) {
        for(int i = 0; i < x; ++i) {
            System.out.println();
        }

    }
}
