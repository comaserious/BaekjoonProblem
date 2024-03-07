package stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAndLast {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            String q = br.readLine();

            System.out.println(String.valueOf(q.charAt(0))+String.valueOf(q.charAt(q.length()-1)));
        }
    }
}
