package algorithm;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args){
        
        Scanner scanint = new Scanner(System.in);
        int a, b;
        a = scanint.nextInt();
        b = scanint.nextInt();

        scanint.close();
        System.out.println(a - b);
    };
};