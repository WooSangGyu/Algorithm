package algorithm.chapter2;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int year;
        
        year = scan.nextInt();

        if ( year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.printf("1");
        } else{
            System.out.printf("0");
        } 
    }
}