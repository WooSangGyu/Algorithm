package algorithm.chapter3;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        if( n <= 100000) {
            for (int i=0; i<n;i++) {
                int sum = n - i;

                System.out.println(sum);
            }
        }
    }
}