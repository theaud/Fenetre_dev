package Utilitaire;

import Utilitaire.scanner;
import Utilitaire.util;

import java.util.Scanner;

/**
 * Created by mathieu on 25/02/2016.
 */



public class test {
    public test() {
    }

    public static void testScanner() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Saisir une ligne :");
        String text = scanner.scanLine(scan);
        System.out.println(text);
        System.out.println(" Saisir une mot :");
        text = scanner.scannext(scan);
        System.out.println(text);
        System.out.println(" Saisir un int :");
        int nb = scanner.scanINT(scan);
        System.out.println(nb);
        System.out.println(" Saisir un double :");
        double nb1 = scanner.scanDOUBLE(scan);
        System.out.println(nb1);
    }

    public static void testInitiatetable() {
        byte x = 10;
        byte y = 10;
        int[][] table = util.InitiateTableIntRandom(x, y);
        util.printTableInt(table, x, y);
    }
}