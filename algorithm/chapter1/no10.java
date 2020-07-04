package algorithm.chapter1;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args){
        
        Scanner scanint = new Scanner(System.in);
        int a, b;
        
        a = scanint.nextInt();
        b = scanint.nextInt();

        scanint.close();

        System.out.println(a*(b%10));
        System.out.println(a*(b%100-b%10)/10);
        System.out.println(a*(b/100));
        System.out.println(a*b);
    };
};