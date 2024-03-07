package stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhereAlph {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        for(int i = 'a' ; i<='z';i++){
            System.out.print(S.indexOf((char)i)+" ");
        }
    }
}
