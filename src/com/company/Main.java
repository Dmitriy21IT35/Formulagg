package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите числа:");
        int x = in.nextInt ();
        int y = in.nextInt ();
        int z = in.nextInt ();
        Formula giu = new Formula (x, y, z);
        giu.displayFormula ();


    }

    static class Formula {
        float x;
        float y;
        float z;

        public Formula(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }


        public void displayFormula() {
            double l = Math.sqrt ((Math.pow (x, 2) + (Math.pow (y, 2)) + (Math.pow (z, 2))));
            System.out.println (l);

        }
    }
}
