package algorithm.chapter2;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int test;
        
        test = scan.nextInt();

        if (test < 60 ){
            System.out.printf("F");
        } else if( test < 70) {
            System.out.printf("D");
        } else if( test < 80) {
            System.out.printf("C");
        } else if( test < 90) {
            System.out.printf("B");
        } else {
            System.out.printf("A");
        }
    }
}