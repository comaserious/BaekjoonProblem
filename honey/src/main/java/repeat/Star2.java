package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Star2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N ; i++){

            for(int j = 0 ; j<N-i;j++){
                System.out.print(" ");
            }
            for(int k =0; k<i+1;k++){
                System.out.print("*");
            }
        System.out.println();
        }

    }
}
