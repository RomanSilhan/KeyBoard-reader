/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard.reader;

import java.util.Scanner;

/**
 *
 * @author roman.silhan
 */
public class KeyBoardReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        System.out.println("Inport Keys");
        int vstup = sc.nextInt();
        int max = 0;
        int min = 10;
        for (int i = 0; i < 10; i++) {
            if (vstup > max) {
                max = vstup;
            }
            if (vstup < min) {
                min = vstup;
            }
        }
        System.out.println("maximum " +max);
        System.out.println("minimum " +min);
    }
}
