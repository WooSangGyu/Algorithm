package algorithm.chapter5;

import java.util.Scanner;
import java.util.Arrays;

public class no1 {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n-1]);
    }
}