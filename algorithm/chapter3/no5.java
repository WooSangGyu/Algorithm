package algorithm.chapter3;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        if( n <= 100000) {
            for (int i=1; i<=n;i++) {
                System.out.println(i);
            }
        }
    }
}