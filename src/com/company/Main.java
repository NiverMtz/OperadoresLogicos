package com.company;

public class Main {

    public static void main(String[] args) {
        boolean X = true;
        boolean Y = false;
        boolean Z = true;

        boolean expA = (X && Y) || (X && Z);
        System.out.println(expA);

        boolean expB =  (X || !Y)&& (!X || Z);
        System.out.println(expB);

        boolean expC= X || Y && Z;
        System.out.println(expC);

        boolean expD =  !(X || Y) && Z;
        System.out.println(expD);

        boolean expE =  X || Y || X && !Z && !Y;
        System.out.println(expE);

        boolean expF =  !X || !Y || Z && X && !Y;
        System.out.println(expF);
    }
}
