package algorithm.chapter4;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       while(sc.hasNextInt()){
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(a+b);
       }
    }
}