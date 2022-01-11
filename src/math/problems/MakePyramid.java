package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        for (int i=1; i<=6; i++) {

            for (int j=6; j>=i; j--) { //i=1 j=6 j=5 j=4 j=3 j=2 j=1 (j=0false)
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(" *");
            }

            System.out.println();


        }
    }
}