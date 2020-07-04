package algorithm.chapter2;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int A, B;
        
        A = scan.nextInt();
        B = scan.nextInt();

        if (A > B){
            System.out.printf(">");
        } else if( A < B) {
            System.out.printf("<");
        } else {
            System.out.printf("==");
        }
    }
}