package mathproblem;

import java.io.IOException;

import java.util.Scanner;

public class Exchange {

    public static void main(String[] args) throws IOException {
        int quarter;
        int dime;
        int nickel;
        int penny;

        Scanner scr =new Scanner(System.in);

        int T = scr.nextInt();
        int[] C = new int[T];

        for(int i =0 ; i<T;i++){
            C[i]=scr.nextInt();
        }
        for(int i = 0 ; i<T;i++ ){
            quarter = C[i]/25;
            dime = C[i]%25/10;
            nickel = C[i]%25%10/5;
            penny = C[i]%25%10%5;

            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);

        }




    }
}
