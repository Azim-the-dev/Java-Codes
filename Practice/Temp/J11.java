package Temp;

import java.util.Scanner;

public class J11 {
    public static void main(String args[]) {

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";

        Scanner scn = new Scanner(System.in);

        System.out.print(RED + "Enter Your Name: " + RESET);
        String name = scn.nextLine();

        System.out.println(GREEN + "        Welcome: " + name + "!" + RESET);

        System.out.println(RED + "Pick one color: " + RESET + GREEN + "O " + RESET + RED + "O" + RESET);
        System.out.print("'G' FOR GREEN, 'R' FOR RED, OR 'B' FOR BOATH: ");
        char color = scn.next().charAt(0);
        scn.close();

        int num = 0;

        switch (color) {
            case 'G':
                while (true) {
                    if (num == 100000) {
                        break;
                    }

                    System.out.print(GREEN + name + " (" + num + "), " + RESET);
                    num++;
                }

            case 'R':
                while (true) {
                    if (num == 100000) {
                        break;
                    }

                    System.out.print(RED + name + " (" + num + "), " + RESET);
                    num++;
                }

            case 'B':
                while (true) {
                    if (num == 100000) {
                        break;
                    }

                    System.out.print(GREEN + name + " (" + num + "), " + RESET);
                    System.out.print(RED + name + " (" + num + "), " + RESET);
                    num++;
                }

            default:
                while (true) {
                    if (num == 100000) {
                        break;
                    }

                    System.out.print(GREEN + "WRONG INPUT!" + " (" + num + "), " + RESET);
                    System.out.print(RED + "WRONG INPUT!" + " (" + num + "), " + RESET);
                    num++;
                }
            }
        }
    }
