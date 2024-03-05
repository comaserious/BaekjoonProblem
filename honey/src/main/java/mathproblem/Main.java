package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer s = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(s.nextToken());
        int B = Integer.parseInt(s.nextToken());

        int index = 1 ;

        while(N > (int)Math.pow(B,index)){
            ++index;
        }
        int num ;

        StringBuilder result = new StringBuilder();


            for (int i = index-1; i >=0; i--) {
                num = N / (int) Math.pow(B, i);
                if (num >= 10) {
                    result.append((char) (num - 10 + 'A'));
                } else {
                    result.append(num);
                }
                N = N % (int) Math.pow(B, i);
            }



        System.out.println(result);



    }
}
