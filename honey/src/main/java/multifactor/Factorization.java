package multifactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        for(int i = 2 ; i<=num;i++){
            while(num%i==0){
                System.out.println(i);
                num = num/i;
            }
        }

    }
}
