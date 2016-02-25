package Utilitaire;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class scanner {
    public scanner() {
    }

    public static boolean scanBoolean(Scanner scan) {
        while(true) {
            if(scan.hasNextInt()) {
                int integer = scan.nextInt();
                scan.nextLine();
                if(integer != 0 && integer != 2) {
                    if(integer != 1) {
                        continue;
                    }

                    return true;
                }

                return false;
            } else if(scan.hasNextLine()) {
                String character = scan.nextLine();
                scan.nextLine();
                char first_character = character.charAt(0);
                if(first_character != 102 && first_character != 70 && first_character != 111 && first_character != 79 && first_character != 110 && first_character != 78) {
                    if(first_character != 121 && first_character != 89 && first_character != 116 && first_character != 84) {
                        if(first_character != 104 && first_character != 72 && first_character != 63) {
                            System.out.println("Invalid input. Please try again.");
                            continue;
                        }

                        System.out.println("You wanted answer :");
                        System.out.println("True = 1   T t True  true  Yes yes Oui oui");
                        System.out.println("false= 0 2 F f False false No  no");
                        continue;
                    }

                    return true;
                }

                return false;
            } else {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine();
            }
        }
    }

    public static int scanINT(Scanner scan) {
        while(!scan.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scan.nextLine();
        }

        int returned = scan.nextInt();
        scan.nextLine();
        return returned;
    }

    public static int scanINT(Scanner scan, int min, int max, int type) {
        int returned = scanINT(scan);
        switch(type) {
            case 1:
                while(returned < min || returned > max) {
                    System.out.print("Invalid input need between :");
                    System.out.println(min + " and " + max + ". Please try again.");
                    returned = scanINT(scan);
                }
                break;
            case 2:
                while(returned < min) {
                    System.out.print("Invalid input need minimum :" + min + ". Please try again.");
                    returned = scanINT(scan);
                }

                return returned;
            case 3:
                while(returned > max) {
                    System.out.print("Invalid input need maximum :" + max + ". Please try again.");
                    returned = scanINT(scan);
                }
        }

        return returned;
    }

    public static double scanDOUBLE(Scanner scan) {
        while(!scan.hasNextDouble()) {
            System.out.println("Invalid input . Please try again.");
            scan.nextLine();
        }

        double returned = scan.nextDouble();
        scan.nextLine();
        return returned;
    }

    public static double scanDOUBLE(Scanner scan, double min, double max, int type) {
        double returned = scanDOUBLE(scan);
        switch(type) {
            case 1:
                while(returned < min || returned > max) {
                    System.out.print("Invalid input need between :");
                    System.out.println(min + " and " + max + ". Please try again.");
                    returned = (double)scanINT(scan);
                }
                break;
            case 2:
                while(returned < min) {
                    System.out.print("Invalid input need minimum :" + min + ". Please try again.");
                    returned = (double)scanINT(scan);
                }

                return returned;
            case 3:
                while(returned > max) {
                    System.out.print("Invalid input need maximum :" + max + ". Please try again.");
                    returned = (double)scanINT(scan);
                }
        }

        return returned;
    }

    public static String scannext(Scanner scan) {
        while(!scan.hasNext()) {
            System.out.println("Invalid input . Please try again.");
            scan.nextLine();
        }

        String returned = scan.next();
        scan.nextLine();
        return returned;
    }

    public static String scanLine(Scanner scan) {
        while(!scan.hasNextLine()) {
            System.out.println("Invalid input . Please try again.");
            scan.nextLine();
        }

        String returned = scan.nextLine();
        return returned;
    }
}
