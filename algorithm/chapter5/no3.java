package algorithm.chapter5;

import java.util.Scanner;
import java.util.Arrays;

public class no3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        int ct = 0;
        int arr42[] = new int[42];
        
        
        for(int i=0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        for(int i=0; i<arr.length;i++) {
            arr42[arr[i]%42]++;
        }
        
        for(int i=0; i<arr42.length;i++) {
            if(arr42[i] != 0) {
                ct++;
            }
        }
        System.out.println(ct);
    }
}