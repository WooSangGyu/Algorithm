package algorithm.chapter5;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int max = 0;
        int cn = 0;

        for(int i = 1; i <= 9; i++) {
            int s = sc.nextInt();

            if ( s > max ) {
                 max = s;
                 cn = i;
            }
        }

        System.out.println(max);
        System.out.println(cn);
    }
}