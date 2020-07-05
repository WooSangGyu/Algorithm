package algorithm.chapter1;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args){
        
        Scanner scanint = new Scanner(System.in);
        Double a, b;
        a = scanint.nextDouble();
        b = scanint.nextDouble();

        scanint.close();
        System.out.println(a/b);
    };
};