package algorithm.chapter4;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int twotemp = 0;
        int cnt = 0;

        one = n/10;
        two = n%10;

        while(true){
            cnt ++;
            twotemp = two;
            two = (one+two) % 10;
            one = twotemp;
           
            if( n == one*10 + two) {
                break;
            }
       }

       System.out.println(cnt);
    }
}