package algorithm;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args){
        
        Scanner scanint = new Scanner(System.in);
        int a, b ,c;
        a = scanint.nextInt();
        b = scanint.nextInt();
        c = scanint.nextInt();

        scanint.close();

        System.out.println((a+b)%c);
        System.out.println((a%c)+(b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c)*(b%c)%c);
    };
};