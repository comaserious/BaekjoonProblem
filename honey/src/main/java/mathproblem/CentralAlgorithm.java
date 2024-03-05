package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CentralAlgorithm {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int start = 4;
        int result ;
        for(int i =1 ;i<=x ;i++){
            result = start*4 -4*(int)Math.pow(2,i-1)-3;
            start = result;

        }
        System.out.println(start);


    }
}
