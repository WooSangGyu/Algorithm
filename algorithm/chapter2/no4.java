package algorithm.chapter2;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float x, y;
        
        x = scan.nextFloat();
        y = scan.nextFloat();

        scan.close();

        if( x > 0 && y > 0) {
            System.out.printf("1");
        } else if (x < 0 && y > 0) {
            System.out.printf("2");
        } else if (x < 0 && y < 0) {
            System.out.printf("3");
        } else {
            System.out.printf("4");
        }
    }
}